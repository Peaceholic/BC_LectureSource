package jw.common.util;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.naming.InitialContext;
import javax.sql.DataSource;

// :: JDBC 절차와 관련된 Utility Bean : Connection return 하는 static method
public class DBUtill {

	public DBUtill() {
		// TODO Auto-generated constructor stub
	}
	
	//==> DBMS의 접속정보로 Connection 생성
	public static Connection getConnection(String driverClassName, String url, String id, String pwd) {
		Connection conn = null;
		
		try {
			Class.forName(driverClassName);
			conn = DriverManager.getConnection(url, id, pwd);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			throw new RuntimeException("DB 접속 시 오류 발생 : " + e);
		}
		return conn;
	}

	public static Connection getConnection() {
		Connection conn = null;
		
		try {
			InitialContext ic = new InitialContext();
			DataSource ds = (DataSource)ic.lookup("java:comp/env/jdbc/ora");
			conn = ds.getConnection();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			//==> DataSource Connection return을 받지 못한 경우
			if (conn == null) {
				conn = getConnection("oracle.jdbc.driver.OracleDriver", 
						"jdbc:oracle:thin:@127.0.0.1:1521:xe", "scott", "tiger");
			}
		}
		return conn;
	}
}
