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

		// Client Form Data ó��
		int regNum = Integer.parseInt(req.getParameter("regNum"));
		String name = req.getParameter("name");
		String gender = req.getParameter("gender");
		String type = req.getParameter("type");

		
		// UserVo �ν��Ͻ� ���� �� Client Form Data ����
		UserVO userVO = new UserVO();
		userVO.setRegNum(regNum);
		userVO.setName(name);
		userVO.setGender(gender);
		userVO.setType(type);
	
		
		// DB���� Data �˻� ��
		UserDao userDao = new UserDao();
		userDao.getUser(userVO);

		out.println("<html>");
		out.println("<head></head>");
		out.println("<body>");

		out.println("<h2> ADD USER ȸ������ </h2>");

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
			out.println(name + " �� ȸ�������� �����մϴ�. ��");
		} else {
			out.println(" ȸ������ ���� �߻� ");
		}

		out.println("<p><p><a href='/homework01/homework01/addUser.html'> ȸ������ �������� �̵�</a>");
		out.println("</body>");
		out.println("</html>");
		// out.flush();
		// out.close();

		System.out.println(" ======== ��ü ���� ======== ");

	}// end of doPost

}// end of class
