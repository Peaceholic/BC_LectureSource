package ÃÖÀÎ±Ô_0906;

import java.sql.*;

public class EmpManager {

	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws Exception {

		new EmpManager().printEmployee("al", 4000);

	}

	public void printEmployee(String name, int salary) throws Exception {

		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		Connection con = DriverManager.getConnection(url, "hr", "hr");
		Statement stmt = con.createStatement();

		ResultSet rs = stmt.executeQuery("SELECT a.employee_id , a.first_name, a.salary " + "FROM employees a "
				+ "WHERE LOWER(a.first_name) LIKE '%" + name + "%' AND a.salary >" + salary);
		while (rs.next()) {
			int num = rs.getInt("EMPLOYEE_ID");
			String fn = rs.getString("FIRST_NAME");
			int s = rs.getInt("SALARY");

			System.out.print("[" + num + "] ");
			System.out.print(fn+" ");
			System.out.println(s);

		}

	}
}