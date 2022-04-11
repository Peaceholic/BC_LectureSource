package √÷¿Œ±‘_0906;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmpManager3 {

	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws SQLException {

		new EmpManager3().printEmployee("South San Francisco", 7000, 10000);

	}

	public void printEmployee(String city, int lo, int hi) throws SQLException {

		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		Connection con = DriverManager.getConnection(url, "hr", "hr");
		Statement stmt = con.createStatement();

		ResultSet rs = stmt
				.executeQuery("SELECT e.last_name, d.department_name " + "FROM employees e, departments d, locations l "
						+ "WHERE e.department_id = d.department_id " + "	AND d.location_id=l.location_id "
						+ "	AND l.city='" + city + "' " + "	AND e.salary between " + lo + " AND " + hi + " ");

		while (rs.next()) {
			String lastName = rs.getString(1);
			String deName = rs.getString(2);

			System.out.println(lastName + "\t " + deName);
		}

		rs.close();
		stmt.close();
		con.close();

	}
}