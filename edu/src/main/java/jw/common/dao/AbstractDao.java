package jw.common.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jw.common.util.DBUtill;

public abstract class AbstractDao {
	///Field
	
	///Constructor
	public AbstractDao() {
		// TODO Auto-generated constructor stub
	}

	///Method
	//==> DBUtil.getConnection() ÀÌ¿כ Connection return
	public Connection connect() {
		Connection conn = null;
		
		try {
			conn = DBUtill.getConnection();
		} catch (RuntimeException e) {
			// TODO: handle exception
			throw e;
		}
		return conn;
	}
	
	//==> Connection / Statement / ResultSet close()
	public void close(Connection conn, PreparedStatement pStmt, ResultSet rs) {
		if (rs != null) {
			try {
				rs.close();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		this.close(conn, pStmt);
	}
	
	//==> Connection / Statement close()
	public void close(Connection conn, PreparedStatement pStmt) {
		if (pStmt != null) {
			try {
				pStmt.close();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		
		if (conn != null) {
			try {
				conn.close();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
}
