package homework03;

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

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("addUser doGet Call");
		this.doPost(request, response);
	}

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		System.out.println("addUser doPOST Call");

		req.setCharacterEncoding("EUC_KR");
		res.setContentType("text/html;charset=EUC_KR");
		PrintWriter out = res.getWriter();

		// Client Form Data ó��
		int regNum = Integer.parseInt(req.getParameter("regNum"));
		String type = req.getParameter("type");
		String id = req.getParameter("id");
		String pw = req.getParameter("pw");
		String name = req.getParameter("name");
		String gender = req.getParameter("gender");
		int phone1 = Integer.parseInt(req.getParameter("phone1"));
		int phone2 = Integer.parseInt(req.getParameter("phone2"));
		int phone3 = Integer.parseInt(req.getParameter("phone3"));

		// UserVo �ν��Ͻ� ���� �� Client Form Data ����
		// Client�� ���� data�� UserVO instance ���� �� Value set
		UserVO userVO = new UserVO();
		userVO.setRegNum(regNum);
		userVO.setType(type);
		userVO.setName(name);
		userVO.setGender(gender);
		userVO.setId(id);
		userVO.setPw(pw);
		userVO.setPhone1(phone1);
		userVO.setPhone2(phone2);
		userVO.setPhone3(phone3);

		// DB���� Data �˻� ��
		// DB�� �����ϴ� UserDAO�� �̿� ȸ������ Insert
		UserDao userDao = new UserDao();
		try {
			userDao.getUser(userVO);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Session ����Ȯ��
		// ȸ������ �Ϸ�� userVO Instance Session �� ����
		HttpSession session = req.getSession(true);

		if (session.isNew()) {
			System.out.println("ession.isNew()");
			session.setAttribute("userVO", userVO);
		}

		out.println("<html>");
		out.println("<head></head>");
		out.println("<body>");

		out.println("<h2> homework03 Add User ȸ������ </h2>");

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
		out.println("<p><p><a href='/homework03/homework03/addUser.html'> ȸ������ ȭ������ �̵�</a>");
		out.println("<p><p><a href='/homework03/homework03/findUser.html'> ȸ����ȸ ȭ������ �̵�</a>");
		out.println("<p><p><a href='/homework03/homework03/'> Folder �̵�</a>");
		out.println("<br><br>");

		out.println("<p><p><a href='/homework03/homework03/FindUser'> ȸ������ ���� (Session)</a>");
		out.println("<br><br>");

		out.println("</body>");
		out.println("</html>");
		// out.flush();
		// out.close();

		System.out.println(" ======== ȸ������ ���� ======== ");

	}// end of doPost

}// end of class
