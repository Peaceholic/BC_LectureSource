import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

/*
 FileName  : ServletTest.java
	�� Servlet Life Cycle  ���� �� Ȯ��
*/
public class HelloServletdoGet extends HttpServlet{

	//init()
	
	//doGet() method Overriding
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		System.out.println(":: servlet doGet() ����");
		System.out.println("Request Client IP : "+ req.getRemoteAddr());

		//�ѱ� ó��
		res.setContentType("text/html;charset=EUC_KR");

		//PrintWriter �ν��Ͻ� ������ Encapsulation�� API ��� Stream ����
		PrintWriter out = res.getWriter();

		out.println("<html>");
		out.println("<head><title>hello Servlet</title></head>");
		out.println("<body>");
		out.println("English : HelloServlet");
		out.println("<p>");
		out.println("Korea : ��� ����");	
		out.println("</body>");
		out.println("</html>");
		out.flush();
		out.close();

		System.out.println(":: servlet doGet() ����\n");
	}
	
	// Web Application �� shutdown �� ȣ��
//	public void destroy(){
//		System.out.println("destroy() : "+ ++destroyCount);
//	}

}//end of class