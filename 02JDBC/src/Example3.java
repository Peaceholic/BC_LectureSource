import java.sql.*;

public class Example3 {

	public static void main(String[] args) throws Exception {

		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(url, "scott", "tiger");
		Statement stmt = con.createStatement();

		String input = args[0];
		String sql = "DELETE FROM firstJDBC WHERE no=" + input;

		int i = stmt.executeUpdate(sql);
		System.out.println("�Է��� ID��ȣ�� : " + input + " �Դϴ�.");
		System.out.println("DELETE �Ǵ� RECODE ���� : " + i + " ���� �����Ǿ����ϴ�. \n");

		stmt.close();
		con.close();
	}
}
