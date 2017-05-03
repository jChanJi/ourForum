package cn.jit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import cn.jit.bean.Reply;
import cn.jit.util.DbHelp;

/**
 * 
 * @author ShunW
 *
 */
public class ReplyDao {
	private static Connection conn;
	private static PreparedStatement pstmt;
	public ReplyDao(){
		conn = new DbHelp().getCon();
	}
	/**
	 * 评论用户的评论发表
	 * @param doc
	 * @return
	 */
	public boolean rInsert(Reply doc){
		int flag=0;
		String sql = "insert into reply (r_id,p_id,u_id,r_content,r_time) values(?,?,?,?,?)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, doc.getR_id());
			pstmt.setInt(2, doc.getP_id());
			pstmt.setInt(3, doc.getU_id());
			pstmt.setString(4, doc.getR_content());
			pstmt.setTimestamp(5, doc.getR_time());
			flag = pstmt.executeUpdate();
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if(flag != 0){
			return true;
		}else{
			return false;
		}
	}
	
	public boolean rDelete(int r_id){
		int flag = 0;
		String sql = "delete from reply where r_id='"+r_id+"'";
		try {
			pstmt = conn.prepareStatement(sql);
			flag = pstmt.executeUpdate();
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if(0!=flag){
			return true;
		}else{
			return false;
		}
	}

}
