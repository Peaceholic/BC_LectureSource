package √÷¿Œ±‘_0906;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Prob6 {
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws Exception {
		printEmployeeList("lon", "resource");
	}

	private static void printEmployeeList(String cityName, String deptName) throws Exception {
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		Connection con = DriverManager.getConnection(url, "hr", "hr");
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT l.city, d.department_name, e.first_name, e.salary "
				+ "FROM departments d, employees e, locations l "
				+ "WHERE e.department_id = d.department_id and d.location_id = l.location_id and lower(l.city) like '%"+cityName+"%' and lower(d.department_name) like '%"+deptName+"%'");
		
		ResultSet rs = stmt.executeQuery(sql);

		while(rs.next()) {
			String cityNm=rs.getString(1);
			String deNm = rs.getString(2);
			String emNm=rs.getString(3);
			int salary = rs.getInt(4);
			
			System.out.println(cityNm+"\t "+deNm+"\t"+emNm+"\t"+salary);
		}
		rs.close();
		stmt.close();	
		con.close();

	}
}
