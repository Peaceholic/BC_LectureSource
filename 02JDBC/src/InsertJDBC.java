import java.sql.*;

public class InsertJDBC {

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

		// DML : INSERT
		String sql1 = "INSERT INTO firstJDBC VALUES(1, 'ȫ�浿', 'a@lycos.co.kr', '�Ѿ�')";
		String sql2 = "INSERT INTO firstJDBC VALUES(2, 'ȫ���', 'a@lycos.co.kr', '�Ѿ�')";
		String sql3 = "INSERT INTO firstJDBC VALUES(3, '�̼���', 'a@lycos.co.kr', '�Ѿ�')";

		// excuteUpdate() : DML ����
		int i = stmt.executeUpdate(sql1);
		System.out.println("1�� insert ���� : " + i + " ���� ���� ����������ϴ�.");
		i = stmt.executeUpdate(sql2);
		System.out.println("2�� insert ���� : " + i + " ���� ���� ����������ϴ�.");
		i = stmt.executeUpdate(sql3);
		System.out.println("3�� insert ���� : " + i + " ���� ���� ����������ϴ�. \n");
		System.out.println("4. query �۾��Ϸ� \n");
	
		if (stmt != null) {
			stmt.close();
		}
		if (con != null) {
			con.close();
		}
	}// end of main
}// end of class
