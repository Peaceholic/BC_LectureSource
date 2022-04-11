package 최인규_0906;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmpManager2 {
	
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws SQLException {
			
		String[] jobs= {"Accountant", "Stock Clerk"};
		new EmpManager2().printEmployee(jobs);
			
	}
	
	public void printEmployee(String jobs[]) throws SQLException {
		
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";		
		Connection con=DriverManager.getConnection(url, "hr", "hr");		
		Statement stmt = con.createStatement();
		
		ResultSet rs = stmt.executeQuery("SELECT a.employee_id 사번, a.first_name 이름, a.salary 연봉 "
				+ "FROM employees a, jobs b "
				+ "WHERE a.job_id = b.job_id and (b.job_title='"+jobs[0]+"' or b.job_title='"+jobs[1]+"') "
				+ "ORDER BY a.employee_id");		
	
		while(rs.next()) {
			int empNo=rs.getInt(1);
			String nm = rs.getString(2);
			int sal = rs.getInt(3);
			System.out.println(empNo+" "+nm+" "+sal);
		}
		
		rs.close();
		stmt.close();		
		con.close();		
	}
}