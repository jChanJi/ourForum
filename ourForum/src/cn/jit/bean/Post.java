package cn.jit.bean;

import java.sql.Date;

/**
 * 
 * @author ShunW
 * 发帖对象
 */
public class Post {
	private int p_id;//发布的帖子的id
	private int u_id;//发帖用户id
	private String p_title;//发帖的名称 不超过50个字
	private String p_content;//发帖的内容
	private Date p_time;//发帖时间
	//无参构造
	public Post(){
		
	}
	/**
	 * 有参构造
	 * @param p_id
	 * @param u_id
	 * @param p_title
	 * @param p_content
	 * @param p_time
	 */
	public Post(int p_id, int u_id, String p_title, String p_content, Date p_time) {
		super();
		this.p_id = p_id;
		this.u_id = u_id;
		this.p_title = p_title;
		this.p_content = p_content;
		this.p_time = p_time;
	}
	public int getP_id() {
		return p_id;
	}
	public void setP_id(int p_id) {
		this.p_id = p_id;
	}
	public int getU_id() {
		return u_id;
	}
	public void setU_id(int u_id) {
		this.u_id = u_id;
	}
	public String getP_title() {
		return p_title;
	}
	public void setP_title(String p_title) {
		this.p_title = p_title;
	}
	public String getP_content() {
		return p_content;
	}
	public void setP_content(String p_content) {
		this.p_content = p_content;
	}
	public Date getP_time() {
		return p_time;
	}
	public void setP_time(Date p_time) {
		this.p_time = p_time;
	}
	//转化成字符串
	@Override
	public String toString() {
		return "Post [p_id=" + p_id + ", u_id=" + u_id + ", p_title=" + p_title + ", p_content=" + p_content
				+ ", p_time=" + p_time + "]";
	}
	
	
}
