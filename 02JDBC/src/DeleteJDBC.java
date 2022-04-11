import java.sql.*;

public class DeleteJDBC {

	public static void main(String[] args) throws Exception {

		// JDBC 절차에 필요한 인스턴스 및 정보 선언
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String driver = "oracle.jdbc.driver.OracleDriver";

		Class.forName(driver);
		System.out.println("1. driver loading OK \n");

		Connection con = DriverManager.getConnection(url, "scott", "tiger");
		System.out.println("2. connection 인스턴스 생성 완료 \n");

		Statement stmt = con.createStatement();
		System.out.println("3. statement 객체 생성완료 \n");

		// DML : DELETE
		String sql1 = "DELETE FROM firstJDBC WHERE no=3";

		// excuteUpdate() : DML 전송
		int i = stmt.executeUpdate(sql1);
		System.out.println("DELETE 된 RECODE 수는 : " + i + " 행이 삭제되었습니다. \n");
		System.out.println("4. query 작업완료 \n");

		if (stmt != null) {
			stmt.close();
		}
		if (con != null) {
			con.close();
		}
	}// end of main
}// end of class
