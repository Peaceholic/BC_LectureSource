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

		// Client Form Data 처리
		int regNum = Integer.parseInt(req.getParameter("regNum"));
		String type = req.getParameter("type");
		String id = req.getParameter("id");
		String pw = req.getParameter("pw");
		String name = req.getParameter("name");
		String gender = req.getParameter("gender");
		int phone1 = Integer.parseInt(req.getParameter("phone1"));
		int phone2 = Integer.parseInt(req.getParameter("phone2"));
		int phone3 = Integer.parseInt(req.getParameter("phone3"));

		// UserVo 인스턴스 생성 및 Client Form Data 전달
		// Client에 받은 data로 UserVO instance 생성 및 Value set
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

		// DB접근 Data 검색 비교
		// DB에 접근하는 UserDAO를 이용 회원정보 Insert
		UserDao userDao = new UserDao();
		try {
			userDao.getUser(userVO);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Session 유무확인
		// 회원가입 완료시 userVO Instance Session 에 저장
		HttpSession session = req.getSession(true);

		if (session.isNew()) {
			System.out.println("ession.isNew()");
			session.setAttribute("userVO", userVO);
		}

		out.println("<html>");
		out.println("<head></head>");
		out.println("<body>");

		out.println("<h2> homework03 Add User 회원가입 </h2>");

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
			out.println(name + " 님 회원가입을 축하합니다. ♡");
			session.setAttribute("userVO", userVO);

		} else {
			out.println(" 회원가입 오류 발생 ");
		}
		out.println("<br><br>");
		out.println("<p><p><a href='/homework03/homework03/addUser.html'> 회원가입 화면으로 이동</a>");
		out.println("<p><p><a href='/homework03/homework03/findUser.html'> 회원조회 화면으로 이동</a>");
		out.println("<p><p><a href='/homework03/homework03/'> Folder 이동</a>");
		out.println("<br><br>");

		out.println("<p><p><a href='/homework03/homework03/FindUser'> 회원정보 보기 (Session)</a>");
		out.println("<br><br>");

		out.println("</body>");
		out.println("</html>");
		// out.flush();
		// out.close();

		System.out.println(" ======== 회원가입 종료 ======== ");

	}// end of doPost

}// end of class
