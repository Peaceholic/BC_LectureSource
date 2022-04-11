package homework02;

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

		req.setCharacterEncoding("EUC_KR");
		res.setContentType("text/html;charset=EUC_KR");
		PrintWriter out = res.getWriter();

		HttpSession session = req.getSession(false);
		UserVO uservo = null;

		if (!(session == null)) {
			String name = (String) session.getAttribute("name");
			if (!(name == null || name.equals(""))) {

				UserDao userDao = new UserDao();
				try {
					uservo = userDao.findUser(name);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} else {
			out.println("회원정보가 없습니다.");
		}

		out.println("<html>");
		out.println("<head></head>");
		out.println("<body>");
		out.println("<h2>나의 회원정보 [2. DoGet]</h2>");
		
		if (uservo != null && uservo.isActive()) {
			out.println(uservo);
			session.invalidate();
		} else {
			out.println("회원정보가 없습니다.");
		}
		out.println("<p><p><a href='/homework02/homework02/addUser.html'> 회원가입 화면으로 이동</a>");
		out.println("<p><p><a href='/homework02/homework02/findUser.html'> 회원조회 화면으로 이동</a>");
		out.println("<p><p><a href='http://localhost:8080/homework02/homework02/'> Folder 이동</a>");
		out.println("</boyd>");
		out.println("</html>");

	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		req.setCharacterEncoding("EUC_KR");
		res.setContentType("text/html;charset=EUC_KR");
		PrintWriter out = res.getWriter();

		String name = req.getParameter("name");

		UserVO uservo = null;
		UserDao userDao = new UserDao();
		try {
			uservo = userDao.findUser(name);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		out.println("<html>");
		out.println("<head></head>");
		out.println("<body>");
		out.println("<h2>나의 회원정보 [1. DoPost]</h2>");
		out.println("<h2>" + name + "</h2>");

		if (uservo.isActive()) {
			out.println(uservo);
		} else {
			out.println("회원정보가 없습니다.");
		}
		out.println("<p><p><a href='/homework02/homework02/addUser.html'> 회원가입 화면으로 이동</a>");
		out.println("<p><p><a href='/homework02/homework02/findUser.html'> 회원조회 화면으로 이동</a>");
		out.println("<p><p><a href='http://localhost:8080/homework02/homework02/'> Folder 이동</a>");
		out.println("</boyd>");
		out.println("</html>");

	}
}