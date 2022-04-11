import java.sql.*;

public class Example2 {

	public static void main(String[] args) throws Exception {

		// String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		// Class.forName("oracle.jdbc.driver.OracleDriver");
		// Connection con = DriverManager.getConnection(url, "scott", "tiger");
		// Statement stmt = con.createStatement();
		//
		// String no = args[0];
		// String id = args[1];
		// String pwd = args[2];
		// String sql1 = "INSERT INTO member VALUES( "+no+" , ' "+id+" ', ' "+pwd+" ')";
		//
		// int i = stmt.executeUpdate(sql1);
		// System.out.println("insert 결과 : " + i + " 개의 행이 만들어졌습니다.");
		//
		// stmt.close();
		// con.close();

		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(url, "scott", "tiger");
		PreparedStatement pstmt = con.prepareStatement("insert into member values(?, ?, ?)");

		pstmt.setInt(1, Integer.parseInt(args[0]));
		pstmt.setString(2, args[1]);
		pstmt.setString(3, args[2]);
			
		int i = pstmt.executeUpdate();
		System.out.println("insert 결과 : " + i + " 개의 행이 만들어졌습니다.");
		
		if (i==1) {
			System.out.println("\nData INSERT 완료 \n");
		} else {
			System.out.println("\nData INSERT 실패 \n");
		}

		pstmt.close();
		con.close();

	}// end of main
}// end of class
