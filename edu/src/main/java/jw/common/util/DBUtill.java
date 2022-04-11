package jw.common.util;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.naming.InitialContext;
import javax.sql.DataSource;

// :: JDBC ������ ���õ� Utility Bean : Connection return �ϴ� static method
public class DBUtill {

	public DBUtill() {
		// TODO Auto-generated constructor stub
	}
	
	//==> DBMS�� ���������� Connection ����
	public static Connection getConnection(String driverClassName, String url, String id, String pwd) {
		Connection conn = null;
		
		try {
			Class.forName(driverClassName);
			conn = DriverManager.getConnection(url, id, pwd);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			throw new RuntimeException("DB ���� �� ���� �߻� : " + e);
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
			//==> DataSource Connection return�� ���� ���� ���
			if (conn == null) {
				conn = getConnection("oracle.jdbc.driver.OracleDriver", 
						"jdbc:oracle:thin:@127.0.0.1:1521:xe", "scott", "tiger");
			}
		}
		return conn;
	}
}
