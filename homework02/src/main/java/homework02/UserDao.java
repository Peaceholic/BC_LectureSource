package homework02;

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
	public void getUser(UserVO userVO) throws Exception {

		Connection con = null;
		PreparedStatement pStmt = null;
		int rs = 0;

		try {

			// 1. DB Connection
			InitialContext ic = new InitialContext();
			DataSource ds = (DataSource) ic.lookup("java:comp/env/jdbc/ora");

			con = ds.getConnection();

			// 2. DB Statement
			pStmt = con.prepareStatement("INSERT INTO member01 "
					+ "(regNum, name, gender, type, phone1, phone2, phone3)"
					+ "VALUES (?, ?, ?, ?, ?, ?, ?)");

			pStmt.setInt(1, userVO.getRegNum());
			pStmt.setString(2, userVO.getName());
			pStmt.setString(3, userVO.getGender());
			pStmt.setString(4, userVO.getType());
			pStmt.setInt(5, userVO.getPhone1());
			pStmt.setInt(6, userVO.getPhone2());
			pStmt.setInt(7, userVO.getPhone3());
			

			// 3. DB ResultSet
			rs = pStmt.executeUpdate();

			if (rs == 1) {
				// debug Console 확인
				System.out.println("DB에서 userVO Data >> " + userVO.getRegNum() 
						+ " | " + userVO.getName() 	+ " | "	+ userVO.getGender() + " | " + userVO.getType() 
						+ " | " + userVO.getPhone1() + " | " + userVO.getPhone2() + " | " + userVO.getPhone3());

				userVO.setActive(true);

			} else {
				// debug Console 확인
				System.out.println("DB에 <" + userVO.getRegNum() + "> 에 해당하는 자료가 없습니다.");
			}

		} catch (Exception e) {
			System.out.println("JDBC 관련 Exception 발생");
			e.printStackTrace();

		} finally {
			con.close();
			pStmt.close();
		}
	}

	public UserVO findUser(String name) throws Exception {
		
		Connection con = null;
		PreparedStatement pStmt = null;
		ResultSet rs = null;

		try {

			InitialContext ic = new InitialContext();
			DataSource ds = (DataSource) ic.lookup("java:comp/env/jdbc/ora");

			con = ds.getConnection();

			pStmt = con.prepareStatement("SELECT * FROM member01 WHERE name = ?");
			pStmt.setString(1, name);
			rs = pStmt.executeQuery();
			UserVO userVofind = new UserVO();

			while (rs.next()) {
				String name01 = rs.getString("name");
				System.out.println(name01);
				userVofind.setRegNum(rs.getInt("regNum"));
				userVofind.setName(rs.getString("name"));
				userVofind.setGender(rs.getString("gender"));
				userVofind.setType(rs.getString("type"));
				userVofind.setPhone1(rs.getInt("phone1"));
				userVofind.setPhone2(rs.getInt("phone2"));
				userVofind.setPhone3(rs.getInt("phone3"));
				
			}
			userVofind.setActive(true);
			return userVofind;

		} catch (Exception e) {
			System.out.println("JDBC 관련 Exception 발생");
			e.printStackTrace();
			return null;
			
		} finally {
			con.close();
			pStmt.close();
		}

	}

}// end of class
