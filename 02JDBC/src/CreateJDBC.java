import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateJDBC {

	public static void main(String[] args) {

		// JDBC 절차에 필요한 인스턴스 및 정보 선언 
		Connection con = null;
		Statement stmt = null;
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		
		// 1. Connection >> Login 과정 추상화 interface		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. driver loading OK");
		} catch (ClassNotFoundException e) {
			System.out.println("\n ==> Drive Loading시 Exception 발생 \n");
			e.printStackTrace();
		} catch (Exception e2) {
			System.out.println("\n ==> 최종 Default Exception 발생 !!");
			e2.printStackTrace();
		}
		
		try {
			con = DriverManager.getConnection(url, "scott", "tiger");
			System.out.println("2. connection 인스턴스 생성 완료");
		} catch (SQLException e) {
			System.out.println("\n ==> JDBC 절차 중 Exception 발생 : " + e.getErrorCode());
			e.printStackTrace();
		} catch (Exception e2) {
			System.out.println("\n ==> 최종 Default Exception 발생 !!");
			e2.printStackTrace();
		}
		
		// 2. Statement >> QUERY 전송 과정 추상화 interface	
		try {
			stmt = con.createStatement();
			System.out.println("3. statement 객체 생성완료");
		} catch (SQLException e) {
			System.out.println("\n ==> JDBC 절차 중 Exception 발생 : " + e.getErrorCode());
			e.printStackTrace();
		} catch (Exception e2) {
			System.out.println("\n ==> 최종 Default Exception 발생 !!");
			e2.printStackTrace();
		}
		
		
		// Create Query 만들기
		String creatSql = 
				"CREATE TABLE firstJDBC" +
				"(no		NUMBER(3), " +
				"name		VARCHAR2(20), " +
				"email		VARCHAR2(30), " +
				"address	VARCHAR2(50)) ";
		
		try {
			System.out.println(":: QUERY 전송결과 : " + stmt.executeUpdate(creatSql));
			System.out.println("4. query 전송완료");
		} catch (SQLException e) {
			System.out.println("\n ==> JDBC 절차 중 Exception 발생 : " + e.getErrorCode());
			e.printStackTrace();
		} catch (Exception e2) {
			System.out.println("\n ==> 최종 Default Exception 발생 !!");
			e2.printStackTrace();
		}
		
		try {
			if(stmt != null) {
				stmt.close();
			}
			if(con != null) {
				con.close();
			}
		} catch (SQLException e) {
			System.out.println("\n ==> JDBC 절차 중 Exception 발생 : " + e.getErrorCode());
			e.printStackTrace();
		} catch (Exception e2) {
			System.out.println("\n ==> 최종 Default Exception 발생 !!");
			e2.printStackTrace();
		}

	}

}
