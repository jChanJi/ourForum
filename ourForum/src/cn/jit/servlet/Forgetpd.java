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
@WebServlet("/forgetpd")
public class Forgetpd extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String phone = request.getParameter("phone");
		//System.out.println(phone);
	    int num = (int)((Math.random()*9+1)*100000);
	    String  number =String.valueOf(num);
	    request.getSession().setAttribute("code",number);
	    Verificattion ver = new Verificattion();
	    try {
			ver.verification(number,phone);
		} catch (ApiException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
