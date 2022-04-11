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

		// Client에서 넘어온 Data 받기
		String name = req.getParameter("name");

		// Session 영역
		// Name 이 Null인 경우
		// <a href='/homework03/homework03/FindUser'> 회원정보 보기 (Session)</a>
		if (name == null) {

			// Session에 저장된 userVO instance 의 Name 사용
			HttpSession session = req.getSession(true);
			name = ((UserVO) session.getAttribute("userVO")).getName();
		}

		// DB접근 UserDao이용 회원정보 select 후
		UserDao userDao = new UserDao();

		// 회원의 정보를 갖는 userVO Intance로 받기
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
		out.println("<h2> 회원 정보 </h2>");
		out.println("<h2>" + name + "</h2>");
		
				
		if(userVO != null){
			out.println(userVO);
		}else{
			out.println(name +"에 해당하는 data는 없습니다.<br/>");
		}
		
		out.println("<p><p><a href='/homework03/homework03/addUser.html'> 회원가입 화면으로 이동</a>");
		out.println("<p><p><a href='/homework03/homework03/findUser.html'> 회원조회 화면으로 이동</a>");
		out.println("<p><p><a href='/homework03/homework03/'> Folder 이동</a>");
		out.println("<br><br>");

		//out.println("<p><p><a href='/homework03/FindUser'> 회원정보 보기 (Session)</a>");
		out.println("<p><p><a href='/homework03/FindUser'> 회원정보 보기 (Session)</a>");
		out.println("<br><br>");
		
	}
}