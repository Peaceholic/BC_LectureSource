package homework02;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//@WebServlet("/Login")
public class AddUser extends HttpServlet {

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		req.setCharacterEncoding("EUC_KR");
		res.setContentType("text/html;charset=EUC_KR");
		PrintWriter out = res.getWriter();

		// Client Form Data ó��
		int regNum = Integer.parseInt(req.getParameter("regNum"));
		String name = req.getParameter("name");
		String gender = req.getParameter("gender");
		String type = req.getParameter("type");
		int phone1 = Integer.parseInt(req.getParameter("phone1"));
		int phone2 = Integer.parseInt(req.getParameter("phone2"));
		int phone3 = Integer.parseInt(req.getParameter("phone3"));

		// Session ����Ȯ��
		HttpSession session = req.getSession(true);

		if (session.isNew()) {
			session.setAttribute("name", name);
		}

		// UserVo �ν��Ͻ� ���� �� Client Form Data ����
		UserVO userVO = new UserVO();
		userVO.setRegNum(regNum);
		userVO.setName(name);
		userVO.setGender(gender);
		userVO.setType(type);
		userVO.setPhone1(phone1);
		userVO.setPhone2(phone2);
		userVO.setPhone3(phone3);

		// DB���� Data �˻� ��
		UserDao userDao = new UserDao();
		try {
			userDao.getUser(userVO);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		out.println("<html>");
		out.println("<head></head>");
		out.println("<body>");

		out.println("<h2> homework02 Add User ȸ������ </h2>");

		if (userVO.isActive()) {

			Enumeration<String> en = req.getParameterNames();

			while (en.hasMoreElements()) {
				String temp = en.nextElement();
				String[] vars = req.getParameterValues(temp);

				for (int i = 0; i < vars.length; i++) {
					out.println("<li> " + temp + " : " + vars[i]);
				}
			}
			out.println("<br><br>");
			out.println(name + " �� ȸ�������� �����մϴ�. ��");
			session.setAttribute("userVO", userVO);

		} else {
			out.println(" ȸ������ ���� �߻� ");
		}
		out.println("<br><br>");
		out.println("<p><p><a href='/homework02/homework02/addUser.html'> ȸ������ ȭ������ �̵�</a>");
		out.println("<p><p><a href='/homework02/homework02/findUser.html'> ȸ����ȸ ȭ������ �̵�</a>");
		out.println("<p><p><a href='http://localhost:8080/homework02/homework02/'> Folder �̵�</a>");
		out.println("<br><br>");

		out.println("<p><p><a href='http://localhost:8080/homework02/FindUser'> ȸ������ ���� (Session ����)</a>");
		out.println("<br><br>");

		out.println("</body>");
		out.println("</html>");
		// out.flush();
		// out.close();

		System.out.println(" ======== ȸ������ ���� ======== ");

	}// end of doPost

}// end of class
