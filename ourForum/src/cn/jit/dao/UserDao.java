package cn.jit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import cn.jit.bean.User;
import cn.jit.util.DbHelp;

public class UserDao {
	private Connection conn;
	private PreparedStatement pstmt;
	
	public UserDao(){
		conn = new DbHelp().getCon();
	}
	
	public  boolean userinsert(User user) {
		int i = 0;
		String sql = "insert into user (u_name,u_passwd) values(?,?)";
	    try {
	        pstmt = (PreparedStatement) conn.prepareStatement(sql);
	        pstmt.setString(1,user.getU_name());
	        pstmt.setString(2,user.getU_passwd());
	        i = pstmt.executeUpdate();
	        pstmt.close();
	        conn.close();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    if(i!=0)
	    	return true;
	    else {
			return false;
		}
	}
	

}
