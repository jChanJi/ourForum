package cn.test;

import java.sql.Timestamp;

import cn.jit.bean.Post;
import cn.jit.bean.Reply;
import cn.jit.bean.User;
import cn.jit.dao.ReplyDao;

public class TestReply {
	public static void main(String[] args) {
		User u = new User();
		Post p = new Post();
		Reply r = new Reply();
		ReplyDao rd = new ReplyDao();
		Timestamp tt = new Timestamp(new java.util.Date().getTime());
		System.out.println();
		r.setP_id(p.getP_id());
		r.setR_content("sdygfjsbdfgiew");
		r.setR_time(tt);
		r.setU_id(u.getU_id());
//		rd.rInsert(r);
		rd.rDelete(3);
	}

}
