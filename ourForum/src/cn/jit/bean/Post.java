package cn.jit.bean;

import java.util.Date;
/**
 * 
 * @author ShunW
 */
public class Post {
	public Post(){
		
	}
	/**
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
	@Override
	public String toString() {
		return "Post [p_id=" + p_id + ", u_id=" + u_id + ", p_title=" + p_title + ", p_content=" + p_content
				+ ", p_time=" + p_time + "]";
	}
	
	
}
