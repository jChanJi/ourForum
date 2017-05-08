package reply;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.jit.bean.Reply;
import cn.jit.dao.ReplyDao;

/**
 * Servlet implementation class reply
 */
@WebServlet("/reply.do")
public class replyServlet extends HttpServlet {
	Reply reply = new Reply();
	ReplyDao rd = new ReplyDao();
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String content = request.getParameter("content");
		Timestamp rtime = new Timestamp(new Date().getTime());
		reply.setR_time(rtime);
		reply.setR_content(content);
		rd.rInsert(reply);
		
	}
		
		
		
}


