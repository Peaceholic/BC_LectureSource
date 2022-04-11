package jw.service.user.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import jw.common.dao.AbstractDao;
import jw.service.user.vo.UserVO;

public class UserDao extends AbstractDao{
	
	public UserDao() {
		// TODO Auto-generated constructor stub
	}

	public void getUser(UserVO userVo) {
		Connection conn = null;
		PreparedStatement pStmt = null;
		ResultSet rs = null;
		
		try {
			// 1단계 Connection
			conn = this.connect();
			
			// 2단계 Statement
			pStmt = conn.prepareStatement("SELECT id, pwd FROM users WHERE id=? AND pwd=?");
			pStmt.setString(1, userVo.getId());
			pStmt.setString(2, userVo.getPwd());
			
			// 3단계 resultset
			rs = pStmt.executeQuery();
			
			if (rs.next()) {
				System.out.println("db에서 확인 한 id, pwd ==> "+userVo.getId() + ", "+userVo.getPwd());
				userVo.setActive(true);
			} else {
				System.out.println("db에 <"+userVo.getId()+"> 없음");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			this.close(conn, pStmt, rs);
		}
	}
	
	public ArrayList<UserVO> getUserList() {
		
		ArrayList<UserVO> arrayList = new ArrayList<UserVO>();
		
		Connection con = null;
		PreparedStatement pStmt = null;
		ResultSet rs = null;
		
		try {
			// 1단계 connection
			con = this.connect();
			
			// 2단계 statement
			pStmt = con.prepareStatement("select id, pwd from users");
						
			// 3단계 resultset
			rs = pStmt.executeQuery();
			
			
			// select 각각의 회원정보 UserVO로 binding
			// 각각의 회원정보를 갖는 UserVO를 Array list에 저장
			while(rs.next()) {
				UserVO userVO = new UserVO();
				
				userVO.setPwd(rs.getString("pwd"));
				userVO.setId(rs.getString("id"));
				
				//userVO 정보확인 console 확인
				
				System.out.println(userVO);
				
				// arrayList에 UserVO 인스턴스 add
				arrayList.add(userVO);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			this.close(con,pStmt,rs);
		}
		return arrayList;
	}// end of getUserList()
}
