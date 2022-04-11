package jw04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserInitParamDao {
	
	private String jdbcDriver;
	private String jdbcURL;
	private String jdbcUser;
	private String jdbcPassword;

	public UserInitParamDao() {
		// TODO Auto-generated constructor stub
		String dburl = "";
		String dbuser = "scott";
		String dbpwd = "tiger";
	}
	
	

	public void setJdbcDriver(String jdbcDriver) {
		this.jdbcDriver = jdbcDriver;
	}



	public void setJdbcURL(String jdbcURL) {
		this.jdbcURL = jdbcURL;
	}



	public void setJdbcUser(String jdbcUser) {
		this.jdbcUser = jdbcUser;
	}



	public void setJdbcPassword(String jdbcPassword) {
		this.jdbcPassword = jdbcPassword;
	}



	public void getUser(UserVO userVo) {
		Connection conn = null;
		PreparedStatement pStmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName(jdbcDriver);
			conn = DriverManager.getConnection(jdbcURL, jdbcUser, jdbcPassword);
			
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
