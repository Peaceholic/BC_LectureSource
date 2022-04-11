import java.sql.*;
import java.util.Scanner;

public class Example0 {

	// �̿ϼ�
	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		System.out.print("[1]TableCREATE, [2]DataINSERT, [3]DataDELETE, [4]DataSELECT\n���ڸ� �Է��ϼ��� :  ");
		int inputData = sc.nextInt();

		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(url, "scott", "tiger");
		PreparedStatement pstmt = con.prepareStatement("insert into member values(?, ?, ?)");
				
		switch (inputData) {

		case 1:			
			System.out.print("���̺� �̸��� �Է��ϼ��� : ");
			String tableName = sc.next();

			String creatSql = "CREATE TABLE "+ tableName+" "
							+ "+ (no		NUMBER(3), " 
							+ "id		VARCHAR2(10), "
							+ "pwd  	VARCHAR2(10)) ";

			System.out.println("QUERY ���� : " + pstmt.executeUpdate(creatSql));

			pstmt.close();
			con.close();
			System.out.println("�Է��Ͻ� �̸��� "+tableName +"�Դϴ�.");
			System.out.println("�Ϸ� �Ǿ����ϴ�");
			
			sc.close();
			break;

		case 2:			
			System.out.print("\n1-�Է��� NO(int)�� �Է��ϼ��� : ");
			int no = sc.nextInt();
			
			System.out.print("\n2-�Է��� ID(String)�� �Է��ϼ��� : ");
			String id = sc.next();
			
			System.out.print("\n3-�Է��� PWD(String)�� �Է��ϼ��� : ");
			String pwd = sc.next();
			
			pstmt.setInt(1, no);
			pstmt.setString(2, id);
			pstmt.setString(3, pwd);
				
			System.out.println("\n�Է��Ͻ� ���� [NO]:"+no+" [ID]:"+id+" [PWD]:"+pwd+" �Դϴ�.");
			
			int confirm = pstmt.executeUpdate();
			System.out.println("\ninsert ��� : " + confirm + " ���� ���� ����������ϴ�.");
			
			if (confirm==1) {
				System.out.println("\nData INSERT �Ϸ�");
			} else {
				System.out.println("\nData INSERT ����");
			}

			pstmt.close();
			con.close();
			sc.close();
			break;

		case 3:
			System.out.print("\n������ NO(int)�� �Է��ϼ��� : ");
			no = sc.nextInt();
				
			String sql = "DELETE FROM firstJDBC WHERE no=" + no;
			int i = pstmt.executeUpdate(sql);

			System.out.println("�Է��� ID��ȣ�� : " + no + " �Դϴ�.");
			System.out.println("DELETE �Ǵ� RECODE ���� : " + i + " ���� �����Ǿ����ϴ�. \n");
			
			sc.close();
			break;

		case 4:
			System.out.print("\n��ȸ�Դϴ�.\n");
			
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

			System.out.println("\nRecord ���� : " + count + "\n");
		
			rs.close();
			stmt.close();
			sc.close();
			break;
		}
	}
}
