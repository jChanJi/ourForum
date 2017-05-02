package cn.jit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import cn.jit.bean.Post;
import cn.jit.util.DbHelp;
/**
 * 
 * @author ShunW
 *
 */
public class PostDao {
	private static Connection conn;
	private static PreparedStatement pstmt;
	public PostDao(){
		conn = new DbHelp().getCon();
	}
	/**
	 * 把发帖人信息和帖子的信息添加到数据库
	 * @param doc
	 * @return
	 */
	public boolean pInsert(Post doc){
		int flag=0;
		String sql = "insert into post (p_id,u_id,p_title,p_content,p_time) values(?,?,?,?,?)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, doc.getP_id());
			pstmt.setInt(2, doc.getU_id());
			pstmt.setString(3, doc.getP_title());
			pstmt.setString(4, doc.getP_content());
			pstmt.setTimestamp(5, doc.getP_time());
			flag = pstmt.executeUpdate();//更新
			//关闭
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
	/**
	 * 删除此贴
	 */
	public boolean pDelete(int p_id){
		int flag = 0;
		String sql="delete from post where p_id='"+p_id+"'";
		try {
			pstmt = conn.prepareStatement(sql);
			flag = pstmt.executeUpdate();//更新
			//关闭
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
