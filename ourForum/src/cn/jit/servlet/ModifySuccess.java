package cn.jit.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.taobao.api.ApiException;

import cn.jit.dao.Verificattion;

/**
 * Servlet implementation class Forgetpd
 */
@WebServlet("/modifysucess")
public class ModifySuccess extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String code = request.getParameter("code");
		//System.out.println(code);
		//System.out.println(request.getSession().getAttribute("code").toString());
		if(code.equals(request.getSession().getAttribute("code").toString()))
		{
			out.print("success");
		}
		else{
			out.print("fail");
		}
		
	}

}
