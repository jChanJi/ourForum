package cn.test;
/**
 * 
 * @author ShunW
 *
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import cn.jit.bean.Post;
import cn.jit.util.DbHelp;

public class PostDaodemo {
	private static PreparedStatement pstmt;
	private static Connection conn;
	private static ResultSet rs;
	public PostDaodemo(){
		conn = new DbHelp().getCon();
	}
	public void insert(Post doc){
		try {
			//判断是否能取出有输入的title
			String sql = "select p_title from post where p_title='"+doc.getP_title()+"'";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			if(!rs.next()||"".equals(rs.next())){
				System.out.println("null");
			}else{
				System.out.println("no null");
			}
//			while(rs.next()){
//				System.out.println(rs.getBoolean("p_title"));
//			}
//			flag = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
