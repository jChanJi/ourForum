package cn.jit.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cn.jit.bean.User;
import cn.jit.dao.UserDao;

@SuppressWarnings("serial")
public class RegisterPasswdServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html,charset=utf-8");
		PrintWriter out = resp.getWriter();
		
		String password = req.getParameter("password");
		String password_confirm = req.getParameter("password_confirm");
		
		if(password.equals(password_confirm)){
			out.print("a");//密码正确
			//此处后台接受注册密码
			HttpSession session = req.getSession();
			session.setAttribute("password",password);
			String un = session.getAttribute("username").toString();
			String pd = session.getAttribute("password").toString();
			
			if(un!=null && pd!=null){
				User user = new User();
				user.setU_name(un);
				user.setU_passwd(pd);
				UserDao userdao = new UserDao();
				boolean b = userdao.userinsert(user);
				System.out.println(b);
			}
		}else{
			out.print("aa");//密码有误
		}
		
		out.flush();
		out.close();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req,resp);
	}
	
}
