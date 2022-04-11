package 최인규_0906;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class Prob5 {
	public static void main(String[] args) throws Exception {

		if (args.length != 1) {
			System.out.println("부서 아이디를 입력하세요 :");
			System.exit(1);
		}
		String dept_id = args[0];

		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		con = DriverManager.getConnection(url, "hr", "hr");
		stmt = con.createStatement();

		rs = stmt.executeQuery("SELECT e.EMPLOYEE_ID 사번, d.DEPARTMENT_NAME 부서이름, e.SALARY 연봉, round(vt.avg, 0) 평균연봉 "
				+ "FROM EMPLOYEES e, DEPARTMENTS d, " + "(SELECT  " + "d1.department_id, avg(e1.salary) avg "
				+ "FROM EMPLOYEES e1, DEPARTMENTS d1 " + "WHERE e1.department_id = d1.department_id "
				+ "GROUP BY d1.DEPARTMENT_ID) vt " + "WHERE e.department_id = vt.department_id AND e.department_id="
				+ dept_id + " and e.department_id = d.department_id " + "ORDER BY 사번");

		ResultSetMetaData rsmd = rs.getMetaData();
		int numberOfColumns = rsmd.getColumnCount(); 
		for (int i = 1; i <= numberOfColumns; i++) {
			System.out.print(rsmd.getColumnName(i) + "\t");
		}
		System.out.println();

		while (rs.next()) {
			int empNo = rs.getInt(1);
			String dNm = rs.getString(2);
			int sal = rs.getInt(3);
			int avsal = rs.getInt(4);
			System.out.println(empNo + "\t " + dNm + "\t" + sal + "\t" + avsal);
		}

		rs.close();
		stmt.close();

		con.close();
	}

}