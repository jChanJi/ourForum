package cn.jit.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/personalInfo")
public class PersonalInfoServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		
		PrintWriter out = resp.getWriter();
		String username = req.getParameter("username");
		
		if(username == "" || username.length() == 0){
			out.print("用户名不能为空");//输入为空
		}else if(username.length() <= 6){
			out.print("用户名过短");//用户名过短
		}else{
			String regex = "^[a-z0-9A-Z\u4e00-\u9fa5]+$";
			if(username.matches(regex))	{
				out.print("用户名可以使用");//符合命名规则
				//此处后台接受个人信息界面的用户名
			}else{
				out.print("含有非法字符");//包含非法字符
			}
			
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doGet(req, resp);
	}

}
