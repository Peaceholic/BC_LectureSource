package jw04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.InitialContext;
import javax.sql.DataSource;

import jw.common.pool.OracleConnectionPool;

public class UserDataSourceDao {

//	String dburl = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
//	String dbuser = "scott";
//	String dbpwd = "tiger";
	
	public UserDataSourceDao() {
		// TODO Auto-generated constructor stub
	}

	public void getUser(UserVO userVo) {
		Connection conn = null;
		PreparedStatement pStmt = null;
		ResultSet rs = null;
		
		try {
//			Class.forName("oracle.jdbc.driver.OracleDriver");
//			conn = DriverManager.getConnection(dburl, dbuser, dbpwd);
			//conn = OracleConnectionPool.getInstance().getConnection();
			
			//==================================================================
			InitialContext ic = new InitialContext();
			DataSource ds = (DataSource)ic.lookup("java:comp/env/jdbc/ora");
			conn = ds.getConnection();
			//==================================================================
			
			pStmt = conn.prepareStatement("SELECT id, pwd FROM users WHERE id=? AND pwd=?");
			pStmt.setString(1, userVo.getId());
			pStmt.setString(2, userVo.getPwd());
			
			rs = pStmt.executeQuery();
			
			if (rs.next()) {
				System.out.println("db에서 확인 한 id, pwd ==> "+userVo.getId() + ", "+userVo.getPwd());
				userVo.setActive(true);
			} else {
				System.out.println("db에 <"+userVo.getId()+"> 없음");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (pStmt != null) {
					pStmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e2) {}
		}
	}
}
