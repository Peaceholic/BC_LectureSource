import java.sql.*;

public class InsertJDBC {

	public static void main(String[] args) throws Exception {

		// JDBC 절차에 필요한 인스턴스 및 정보 선언
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String driver = "oracle.jdbc.driver.OracleDriver";

		Class.forName(driver);
		System.out.println("1. driver loading OK \n");

		Connection con = DriverManager.getConnection(url, "scott", "tiger");
		System.out.println("2. connection 인스턴스 생성 완료 \n");

		Statement stmt = con.createStatement();
		System.out.println("3. statement 객체 생성완료 \n");

		// DML : INSERT
		String sql1 = "INSERT INTO firstJDBC VALUES(1, '홍길동', 'a@lycos.co.kr', '한양')";
		String sql2 = "INSERT INTO firstJDBC VALUES(2, '홍길순', 'a@lycos.co.kr', '한양')";
		String sql3 = "INSERT INTO firstJDBC VALUES(3, '이순신', 'a@lycos.co.kr', '한양')";

		// excuteUpdate() : DML 전송
		int i = stmt.executeUpdate(sql1);
		System.out.println("1번 insert 유무 : " + i + " 개의 행이 만들어졌습니다.");
		i = stmt.executeUpdate(sql2);
		System.out.println("2번 insert 유무 : " + i + " 개의 행이 만들어졌습니다.");
		i = stmt.executeUpdate(sql3);
		System.out.println("3번 insert 유무 : " + i + " 개의 행이 만들어졌습니다. \n");
		System.out.println("4. query 작업완료 \n");
	
		if (stmt != null) {
			stmt.close();
		}
		if (con != null) {
			con.close();
		}
	}// end of main
}// end of class
