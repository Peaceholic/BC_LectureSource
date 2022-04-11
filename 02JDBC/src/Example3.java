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
		System.out.println("입력한 ID번호는 : " + input + " 입니다.");
		System.out.println("DELETE 되는 RECODE 수는 : " + i + " 행이 삭제되었습니다. \n");

		stmt.close();
		con.close();
	}
}
