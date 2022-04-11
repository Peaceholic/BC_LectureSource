package homework01;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/Login")
public class AddUser extends HttpServlet {

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		req.setCharacterEncoding("utf-8");
		res.setContentType("text/html;charset=utf-8");
		PrintWriter out = res.getWriter();

		// Client Form Data 처리
		int regNum = Integer.parseInt(req.getParameter("regNum"));
		String name = req.getParameter("name");
		String gender = req.getParameter("gender");
		String type = req.getParameter("type");

		
		// UserVo 인스턴스 생성 및 Client Form Data 전달
		UserVO userVO = new UserVO();
		userVO.setRegNum(regNum);
		userVO.setName(name);
		userVO.setGender(gender);
		userVO.setType(type);
	
		
		// DB접근 Data 검색 비교
		UserDao userDao = new UserDao();
		userDao.getUser(userVO);

		out.println("<html>");
		out.println("<head></head>");
		out.println("<body>");

		out.println("<h2> ADD USER 회원가입 </h2>");

		if (userVO.isActive()) {
			
			Enumeration<String> en = req.getParameterNames();
			
			while(en.hasMoreElements()){
				String temp = en.nextElement();	
				String[] vars = req.getParameterValues(temp);
				
				for(int i=0;i<vars.length;i++){
	                out.println("<li> " + temp + " : " + vars[i]);
	            }		
			}
			
			out.println("<br><br>");
			out.println(name + " 님 회원가입을 축하합니다. ♡");
		} else {
			out.println(" 회원가입 오류 발생 ");
		}

		out.println("<p><p><a href='/homework01/homework01/addUser.html'> 회원가입 페이지로 이동</a>");
		out.println("</body>");
		out.println("</html>");
		// out.flush();
		// out.close();

		System.out.println(" ======== 전체 종료 ======== ");

	}// end of doPost

}// end of class
