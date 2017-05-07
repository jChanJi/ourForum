package cn.jit.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
