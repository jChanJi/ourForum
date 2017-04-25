package cn.jit.javabean;
/**
 * 
 * @author ChanJi
 *用户对象
 */
public class User {
	private String u_id;//编号
	private String u_name;//用户名规定格式
	private String u_passwd;//密码，规定格式
	private String u_sex;//性别，男或者女
	private String u_mail;//邮箱，规定格式
	private String u_occupation;//职业，不多于20个字
	private String u_des;//简介，一百字以内
	private String u_hp;//头像的地址（文件的地址）
	private String u_location;//常住地址，50 个字以内
	
	//无参构造函数，必须写！
	public User(){
		
	}

	public String getU_id() {
		return u_id;
	}

	public void setU_id(String u_id) {
		this.u_id = u_id;
	}

	public String getU_name() {
		return u_name;
	}

	public void setU_name(String u_name) {
		this.u_name = u_name;
	}

	public String getU_passwd() {
		return u_passwd;
	}

	public void setU_passwd(String u_passwd) {
		this.u_passwd = u_passwd;
	}

	public String getU_sex() {
		return u_sex;
	}

	public void setU_sex(String u_sex) {
		this.u_sex = u_sex;
	}

	public String getU_mail() {
		return u_mail;
	}

	public void setU_mail(String u_mail) {
		this.u_mail = u_mail;
	}

	public String getU_occupation() {
		return u_occupation;
	}

	public void setU_occupation(String u_occupation) {
		this.u_occupation = u_occupation;
	}

	public String getU_des() {
		return u_des;
	}

	public void setU_des(String u_des) {
		this.u_des = u_des;
	}

	public String getU_hp() {
		return u_hp;
	}

	public void setU_hp(String u_hp) {
		this.u_hp = u_hp;
	}

	public String getU_location() {
		return u_location;
	}

	public void setU_location(String u_location) {
		this.u_location = u_location;
	}

	//转化成字符串
	@Override
	public String toString() {
		return "User [u_id=" + u_id + ", u_name=" + u_name + ", u_passwd=" + u_passwd + ", u_sex=" + u_sex + ", u_mail="
				+ u_mail + ", u_occupation=" + u_occupation + ", u_des=" + u_des + ", u_hp=" + u_hp + ", u_location="
				+ u_location + "]";
	}
	
	
	
	
	

}
