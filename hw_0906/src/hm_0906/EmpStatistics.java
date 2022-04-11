package ÃÖÀÎ±Ô_0906;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class EmpStatistics {

	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws Exception {
		int maxSalary = 10000;
		new EmpStatistics().printStatistics(maxSalary);

		maxSalary = 15000;
		new EmpStatistics().printStatistics(maxSalary);

	}

	private void printStatistics(int maxSalary) throws Exception {

		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		Connection con = DriverManager.getConnection(url, "hr", "hr");
		Statement stmt = con.createStatement();

		System.out.println("====================================");
		System.out.println("Max Salary : " + maxSalary);
		System.out.println("====================================");

		ResultSet rs = stmt.executeQuery(
				"SELECT * " + "FROM( SELECT j.job_title , AVG(e.salary) avg " + "FROM employees e, jobs j "
						+ "WHERE e.job_id= j.job_id " + "GROUP BY j.job_title )" + "WHERE avg > " + maxSalary);

		while (rs.next()) {
			String jobTitle = rs.getString("JOB_TITLE");
			int avg = rs.getInt("avg");

			System.out.print("[" + jobTitle + "]  ");
			System.out.println(avg);
		}
	}
}// end of class
