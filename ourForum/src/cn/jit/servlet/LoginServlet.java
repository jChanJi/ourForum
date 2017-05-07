package cn.jit.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out = resp.getWriter();
		String username = req.getParameter("userName");
		String password = req.getParameter("password");
		if(username == "" || username.length() == 0){
			out.print("aa");//输入为空
		}else if(username.length() <= 6){
			out.print("aaaa");//用户名过短
		}else{
			String regex = "^[a-z0-9A-Z\u4e00-\u9fa5]+$";
			if(username.matches(regex))	{
				out.print("a");//符合命名规则
				//此处后台接受登陆用户名
			}else{
				out.print("aaa");//包含非法字符
			}
			
		}
		
		out.flush();
		out.close();
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req,resp);
	}
	
	
}
