import java.sql.*;

public class Example4 {

	public static void main(String[] args) throws Exception {

		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(url, "scott", "tiger");
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM member");

		int count = 0;
		while (rs.next()) {
			count++;

			int no = rs.getInt("no");
			String id = rs.getString("id");
			String pwd = rs.getString("pwd");
			
			System.out.println("\nNO : " + no);
			System.out.println("ID : " + id);
			System.out.println("PWD : " + pwd);
		}

		System.out.println("\nRecord °³¼ö : " + count + "\n");
	
		rs.close();
		stmt.close();
		con.close();
	}
}