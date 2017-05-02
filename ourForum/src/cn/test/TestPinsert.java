package cn.test;

import java.sql.Timestamp;

import cn.jit.bean.Post;
import cn.jit.bean.User;
import cn.jit.dao.PostDao;

public class TestPinsert {
	public static void main(String[] args) {
		Timestamp ttime = new Timestamp(new java.util.Date().getTime());
		User user = new User();
		Post p = new Post();
//		user.setU_name("ws");
//		user.setU_des("as");
//		user.setU_hp("sad");
//		user.setU_location("asd");
//		user.setU_mail("sadas");
//		user.setU_passwd("asdasf");
//		user.setU_sex("man");
//		user.setU_occupation("sadae");
		p.setU_id(user.getU_id());
		p.setP_time(ttime);
		p.setP_title("aasdka");
		p.setP_content("saukfgaksfk");
		PostDao pd = new PostDao();
		pd.pInsert(p);
//		pd.pDelete(5);
	}

}
