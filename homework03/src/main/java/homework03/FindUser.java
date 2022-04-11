package homework03;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//@WebServlet("/AddUser")

public class FindUser extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		this.doPost(req, res);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		req.setCharacterEncoding("EUC_KR");
		res.setContentType("text/html;charset=EUC_KR");
		PrintWriter out = res.getWriter();

		// Client���� �Ѿ�� Data �ޱ�
		String name = req.getParameter("name");

		// Session ����
		// Name �� Null�� ���
		// <a href='/homework03/homework03/FindUser'> ȸ������ ���� (Session)</a>
		if (name == null) {

			// Session�� ����� userVO instance �� Name ���
			HttpSession session = req.getSession(true);
			name = ((UserVO) session.getAttribute("userVO")).getName();
		}

		// DB���� UserDao�̿� ȸ������ select ��
		UserDao userDao = new UserDao();

		// ȸ���� ������ ���� userVO Intance�� �ޱ�
		UserVO userVO = null;
		
		try {
			userVO = userDao.findUser(name);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}				

		out.println("<html>");
		out.println("<head></head>");
		out.println("<body>");
		out.println("<h2> ȸ�� ���� </h2>");
		out.println("<h2>" + name + "</h2>");
		
				
		if(userVO != null){
			out.println(userVO);
		}else{
			out.println(name +"�� �ش��ϴ� data�� �����ϴ�.<br/>");
		}
		
		out.println("<p><p><a href='/homework03/homework03/addUser.html'> ȸ������ ȭ������ �̵�</a>");
		out.println("<p><p><a href='/homework03/homework03/findUser.html'> ȸ����ȸ ȭ������ �̵�</a>");
		out.println("<p><p><a href='/homework03/homework03/'> Folder �̵�</a>");
		out.println("<br><br>");

		//out.println("<p><p><a href='/homework03/FindUser'> ȸ������ ���� (Session)</a>");
		out.println("<p><p><a href='/homework03/FindUser'> ȸ������ ���� (Session)</a>");
		out.println("<br><br>");
		
	}
}