import java.sql.*;

public class Example1 {

	public static void main(String[] args) throws Exception {
	
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(url, "scott", "tiger");
		Statement stmt = con.createStatement();
		
		String creatSql = "CREATE TABLE member" 
				+ "(no		NUMBER(3), " 
				+ "id		VARCHAR2(10), "
				+ "pwd  	VARCHAR2(10)) ";
		
		System.out.println("QUERY Àü¼Û : " + stmt.executeUpdate(creatSql));

		stmt.close();
		con.close();

	}
}
