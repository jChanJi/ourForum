package cn.jit.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/personalInfoEmail")
public class PersonalInfoEmailServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
	
		String email = req.getParameter("email");
		PrintWriter out = resp.getWriter();
		
	    String regex = "\\w+\\x40\\w+\\x2e\\w+"; 
	    /*System.out.println(email);*/
	    if(email == null || email.length() == 0){
			out.print("邮箱不能为空");//输入为空
		}else{
			if(email.matches(regex))	{
				out.print("邮箱可以使用");//符合命名规则
			}else{
				out.print("不正确的邮箱格式");//包含非法字符
			}
			
		}
		
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doGet(req, resp);
	}
	
}
