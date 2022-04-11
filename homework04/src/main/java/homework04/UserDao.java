package homework04;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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
			pStmt = con.prepareStatement(
					"INSERT INTO memberhw01 " + "(regNum, type, id, pw, name, gender, phone1, phone2, phone3)"
							+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)");

			pStmt.setInt(1, userVO.getRegNum());
			pStmt.setString(2, userVO.getType());
			pStmt.setString(3, userVO.getId());
			pStmt.setString(4, userVO.getPw());
			pStmt.setString(5, userVO.getName());
			pStmt.setString(6, userVO.getGender());
			pStmt.setInt(7, userVO.getPhone1());
			pStmt.setInt(8, userVO.getPhone2());
			pStmt.setInt(9, userVO.getPhone3());

			// 3. DB ResultSet
			rs = pStmt.executeUpdate();

			if (rs == 1) {
				// debug Console 확인
				System.out.println("\n DAO userVO Data " + "\n regNum : " + userVO.getRegNum() + "\n type : "
						+ userVO.getType() + "\n id : " + userVO.getId() + "\n pw : " + userVO.getPw() + "\n name : "
						+ userVO.getName() + "\n gender : " + userVO.getGender() + "\n phone1 : " + userVO.getPhone1()
						+ "\n phone2 : " + userVO.getPhone2() + "\n phone3 : " + userVO.getPhone3());

				userVO.setActive(true);

			} else {
				// debug Console 확인
				System.out.println("\n DAO userVO Data " + "\n regNum : " + userVO.getRegNum() + "\n type : "
						+ userVO.getType() + "\n id : " + userVO.getId() + "\n pw : " + userVO.getPw() + "\n name : "
						+ userVO.getName() + "\n gender : " + userVO.getGender() + "\n phone1 : " + userVO.getPhone1()
						+ "\n phone2 : " + userVO.getPhone2() + "\n phone3 : " + userVO.getPhone3()
						+ "\n 에 해당하는 자료가 없습니다.");
			}

		} catch (Exception e) {
			System.out.println("JDBC 관련 Exception 발생");
			e.printStackTrace();

		} finally {

			if (pStmt != null) {
				try {
					pStmt.close();
					System.out.println("JDBC_pStmt Close 완료");
				} catch (Exception e) {
					System.out.println("JDBC_pStmt Close 오류발생");
					e.printStackTrace();
				}
			}

			if (con != null) {
				try {
					con.close();
					System.out.println("JDBC_con Close 완료");
				} catch (Exception e) {
					System.out.println("JDBC_con Close 오류발생");
					e.printStackTrace();
				}
			}
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

			pStmt = con.prepareStatement("SELECT * FROM memberhw01 WHERE name = ?");
			pStmt.setString(1, name);
			rs = pStmt.executeQuery();
			UserVO userVofind = new UserVO();

			while (rs.next()) {
				String targetName = rs.getString("name");
				System.out.println(targetName);
				userVofind.setRegNum(rs.getInt("regNum"));
				userVofind.setType(rs.getString("type"));
				userVofind.setId(rs.getString("id"));
				userVofind.setPw(rs.getString("pw"));
				userVofind.setName(rs.getString("name"));
				userVofind.setGender(rs.getString("gender"));
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

			// 각각의 DB와 관련된 객체 close
			if (rs != null) {
				try {
					rs.close();
					System.out.println("JDBC_rs Close 완료");
				} catch (Exception e) {
					System.out.println("JDBC_rs Close 오류발생");
					e.printStackTrace();
				}
			}

			if (pStmt != null) {
				try {
					pStmt.close();
					System.out.println("JDBC_pStmt Close 완료");
				} catch (Exception e) {
					System.out.println("JDBC_con pStmt 오류발생");
					e.printStackTrace();
				}
			}
			if (con != null) {
				try {
					con.close();
					System.out.println("JDBC_con Close 완료");
				} catch (Exception e) {
					System.out.println("JDBC_con Close 오류발생");
					e.printStackTrace();
				}
			}
		}

	}

	public void updateUser(UserVO userVO) {

		Connection con = null;
		PreparedStatement pstmt = null;
	
		try {
			InitialContext ic = new InitialContext();
			DataSource ds = (DataSource) ic.lookup("java:comp/env/jdbc/ora");

			con = ds.getConnection();
			System.out.println("DB 연결");

			pstmt = con.prepareStatement(
					"UPDATE memberhw01 SET type=?, pw=?, name=?, gender=?, phone1=?, phone2=?, phone3=? WHERE id=?");

			pstmt.setString(1, userVO.getType());
			pstmt.setString(2, userVO.getPw());
			pstmt.setString(3, userVO.getName());
			pstmt.setString(4, userVO.getGender());
			pstmt.setInt(5, userVO.getPhone1());
			pstmt.setInt(6, userVO.getPhone2());
			pstmt.setInt(7, userVO.getPhone3());
			pstmt.setString(8, userVO.getId());

			if (1 == pstmt.executeUpdate()) {
				userVO.setActive(true);
				System.out.println("DB 수정 완료");
				System.out.println("======================");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Exception 발생");
		
		
		} finally {
			
			// 각각의 DB와 관련된 객체 close
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (Exception e2) {
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (Exception e3) {
				}
			}
		}
	}

}// end of class
