package cn.jit.servlet.login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.jit.bean.User;

/**
 * 
 * @author ChanJi
 *用户注册sevlet
 */
@WebServlet("/login.do")
public class Login extends HttpServlet {

	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	doPost(request,response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("userName");
		String password = request.getParameter("password");
		//创建User对象，将前台数据传入
		User user = new User();
		user.setU_name(username);
		user.setU_passwd(password);
		user.setU_sex(null);
		user.setU_mail(null);
		user.setU_occupation(null);
		user.setU_hp(null);
		user.setU_des(null);
		user.setU_location(null);
		System.out.println(user.getU_name());
		
		
		
		
		
	}

}
