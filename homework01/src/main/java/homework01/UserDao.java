package homework01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.InitialContext;
import javax.sql.DataSource;

//@WebServlet("/Login")
public class UserDao {

	// Constructor
	public UserDao() {
	}

	// Method
	public void getUser(UserVO userVO) {

		Connection con = null;
		PreparedStatement pStmt = null;
		int rs = 0;

		try {
			
			// 1. DB Connection
			InitialContext ic = new InitialContext();
			DataSource ds = (DataSource) ic.lookup("java:comp/env/jdbc/ora");

			con = ds.getConnection();
		
			// 2. DB Statement
			pStmt = con.prepareStatement("INSERT INTO member01 (regNum, name, gender, type) VALUES (?, ?, ?, ?)");	
					
			pStmt.setInt(1, userVO.getRegNum());
			pStmt.setString(2, userVO.getName());
			pStmt.setString(3, userVO.getGender());
			pStmt.setString(4, userVO.getType());
		
			// 3. DB ResultSet
			rs = pStmt.executeUpdate();

			if (rs == 1) {
				// debug Console Ȯ��
				System.out.println("DB���� userVO Data >> " + userVO.getRegNum()
										+ " | " + userVO.getName()
										+ " | " + userVO.getGender()
										+ " | " + userVO.getType()	);

				userVO.setActive(true);

			} else {
				// debug Console Ȯ��
				System.out.println("DB�� <" + userVO.getRegNum() + "> �� �ش��ϴ� �ڷᰡ �����ϴ�.");
			}

		} catch (Exception e) {
			System.out.println("JDBC ���� Exception �߻�");
			e.printStackTrace();

		} /*finally {
			// JDBC �ν��Ͻ� close
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			if (pStmt != null) {
				try {
					pStmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
            
		} */
	}

}// end of class
