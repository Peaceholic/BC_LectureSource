package jw05;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jw04.UserDataSourceDao;
import jw04.UserVO;

public class LoginBeanDataSourceSession extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException{
		this.doPost(req, res);
	}
	
	public void doPost(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException{
			
		req.setCharacterEncoding("EUC_KR");
		res.setContentType("text/html;charset=EUC_KR");
		PrintWriter out = res.getWriter();
		
		String id = req.getParameter("id");
		String pwd = req.getParameter("pwd");
			
		HttpSession session = req.getSession(true);
			
		UserVO userVO = (UserVO)session.getAttribute("userVO");
		System.out.println("session�� ����� UserVO ���� ȭ�� : "+userVO);
			
		if (!(id == null || "".equals(id))) {
			userVO = new UserVO();
			userVO.setId(id);
			userVO.setPwd(pwd);
		}
			
		UserDataSourceDao udsd = new UserDataSourceDao();
		udsd.getUser(userVO);
			
		out.print("<html>");
		out.print("<head></head>");
		out.print("<body>");
		out.print("<h2>Login ȭ��</h2>");
			
		if (userVO != null && userVO.isActive()) {
			out.println(userVO.getId()+"�� ȯ���մϴ�.");
			session.setAttribute("userVO", userVO);
		}else {
			out.println("login ���� id,pwd�� Ȯ���ϼ���.");
		}
		
		out.println("<p><p><a href='/edu/jw05/loginBeanDataSourceSessionJavaScript.html'>�ڷ�</a>");
		out.println("</boyd>");
		out.println("</html>");
	}
}
