package cn.jit.bean;

import java.util.Date;
/**
 * 
 * @author ShunW
 * 回帖对象
 */
public class Reply {
	private int r_id;//回复帖子的id
	private int p_id;//发布帖子的id
	private int u_id;//回帖用户id
	private String r_content;//回复的内容
	private Date r_time;//回复时间
	//无参构造
	public Reply(){
		
	}
	/**
	 * 有参构造
	 * @param r_id
	 * @param p_id
	 * @param u_id
	 * @param r_content
	 * @param r_time
	 */
	public Reply(int r_id, int p_id, int u_id, String r_content, Date r_time) {
		super();
		this.r_id = r_id;
		this.p_id = p_id;
		this.u_id = u_id;
		this.r_content = r_content;
		this.r_time = r_time;
	}
	public int getR_id() {
		return r_id;
	}
	public void setR_id(int r_id) {
		this.r_id = r_id;
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
	public String getR_content() {
		return r_content;
	}
	public void setR_content(String r_content) {
		this.r_content = r_content;
	}
	public Date getR_time() {
		return r_time;
	}
	public void setR_time(Date r_time) {
		this.r_time = r_time;
	}
	//转化成字符串
	@Override
	public String toString() {
		return "Reply [r_id=" + r_id + ", p_id=" + p_id + ", u_id=" + u_id + ", r_content=" + r_content + ", r_time="
				+ r_time + "]";
	}
	

}
