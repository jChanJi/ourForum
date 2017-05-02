package cn.jit.servlet.post;

import java.io.IOException;
import java.sql.Timestamp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.jit.bean.Post;
import cn.jit.dao.PostDao;
/**
 * Servlet implementation class Post
 */
@WebServlet("/Post.do")
public class PostServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Post post = new Post();
	PostDao postdao = new PostDao();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		
		Timestamp ptime = new Timestamp(new java.util.Date().getTime());
		
		post.setP_time(ptime);
		post.setP_title(title);
		post.setP_content(content);

		postdao.pInsert(post);
	}

}
