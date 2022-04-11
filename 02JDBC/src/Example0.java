import java.sql.*;
import java.util.Scanner;

public class Example0 {

	// 미완성
	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		System.out.print("[1]TableCREATE, [2]DataINSERT, [3]DataDELETE, [4]DataSELECT\n숫자를 입력하세요 :  ");
		int inputData = sc.nextInt();

		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(url, "scott", "tiger");
		PreparedStatement pstmt = con.prepareStatement("insert into member values(?, ?, ?)");
				
		switch (inputData) {

		case 1:			
			System.out.print("테이블 이름을 입력하세요 : ");
			String tableName = sc.next();

			String creatSql = "CREATE TABLE "+ tableName+" "
							+ "+ (no		NUMBER(3), " 
							+ "id		VARCHAR2(10), "
							+ "pwd  	VARCHAR2(10)) ";

			System.out.println("QUERY 전송 : " + pstmt.executeUpdate(creatSql));

			pstmt.close();
			con.close();
			System.out.println("입력하신 이름은 "+tableName +"입니다.");
			System.out.println("완료 되었습니다");
			
			sc.close();
			break;

		case 2:			
			System.out.print("\n1-입력할 NO(int)를 입력하세요 : ");
			int no = sc.nextInt();
			
			System.out.print("\n2-입력할 ID(String)을 입력하세요 : ");
			String id = sc.next();
			
			System.out.print("\n3-입력할 PWD(String)을 입력하세요 : ");
			String pwd = sc.next();
			
			pstmt.setInt(1, no);
			pstmt.setString(2, id);
			pstmt.setString(3, pwd);
				
			System.out.println("\n입력하신 값은 [NO]:"+no+" [ID]:"+id+" [PWD]:"+pwd+" 입니다.");
			
			int confirm = pstmt.executeUpdate();
			System.out.println("\ninsert 결과 : " + confirm + " 개의 행이 만들어졌습니다.");
			
			if (confirm==1) {
				System.out.println("\nData INSERT 완료");
			} else {
				System.out.println("\nData INSERT 실패");
			}

			pstmt.close();
			con.close();
			sc.close();
			break;

		case 3:
			System.out.print("\n삭제할 NO(int)를 입력하세요 : ");
			no = sc.nextInt();
				
			String sql = "DELETE FROM firstJDBC WHERE no=" + no;
			int i = pstmt.executeUpdate(sql);

			System.out.println("입력한 ID번호는 : " + no + " 입니다.");
			System.out.println("DELETE 되는 RECODE 수는 : " + i + " 행이 삭제되었습니다. \n");
			
			sc.close();
			break;

		case 4:
			System.out.print("\n조회입니다.\n");
			
			Statement stmt = con.createStatement();			
			ResultSet rs = stmt.executeQuery("SELECT * FROM member");

			int count = 0;
			while (rs.next()) {
				count++;

				int rsno = rs.getInt("no");
				String rsid = rs.getString("id");
				String rspwd = rs.getString("pwd");
				
				System.out.println("\nNO : " + rsno);
				System.out.println("ID : " + rsid);
				System.out.println("PWD : " + rspwd);
			}

			System.out.println("\nRecord 개수 : " + count + "\n");
		
			rs.close();
			stmt.close();
			sc.close();
			break;
		}
	}
}
