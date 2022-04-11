import java.sql.*;

public class DeleteJDBC {

	public static void main(String[] args) throws Exception {

		// JDBC ������ �ʿ��� �ν��Ͻ� �� ���� ����
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String driver = "oracle.jdbc.driver.OracleDriver";

		Class.forName(driver);
		System.out.println("1. driver loading OK \n");

		Connection con = DriverManager.getConnection(url, "scott", "tiger");
		System.out.println("2. connection �ν��Ͻ� ���� �Ϸ� \n");

		Statement stmt = con.createStatement();
		System.out.println("3. statement ��ü �����Ϸ� \n");

		// DML : DELETE
		String sql1 = "DELETE FROM firstJDBC WHERE no=3";

		// excuteUpdate() : DML ����
		int i = stmt.executeUpdate(sql1);
		System.out.println("DELETE �� RECODE ���� : " + i + " ���� �����Ǿ����ϴ�. \n");
		System.out.println("4. query �۾��Ϸ� \n");

		if (stmt != null) {
			stmt.close();
		}
		if (con != null) {
			con.close();
		}
	}// end of main
}// end of class
