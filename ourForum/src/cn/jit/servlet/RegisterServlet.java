package cn.jit.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out = resp.getWriter();
		String userName = req.getParameter("userName");
		String password = req.getParameter("password");
		String password_confirm = req.getParameter("password_confirm");
		
		if(userName == "" || userName.length() == 0){
			out.print("aa");//输入为空
		}else if(userName.length() <= 6){
			out.print("aaaa");//用户名过短
		}else{
			String regex = "^[a-z0-9A-Z\u4e00-\u9fa5]+$";
			if(userName.matches(regex))	{
				out.print("a");//符合命名规则
				//此处后台接受注册用户名
			}else{
				out.print("aaa");//包含非法字符
			}
			
		}
		
		
		
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req,resp);
	}
	
}
