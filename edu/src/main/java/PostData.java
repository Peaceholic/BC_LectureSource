import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

/*
 FileName  : ServletTest.java
	�� Servlet Life Cycle  ���� �� Ȯ��
*/
public class PostData extends HttpServlet{
	
	//1.Client Get ������� Request :: doGet() method O/R
	//2.service() O/R ����
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		//16���� ���ڵ��� client form data �ѱ� ���ڵ�
		req.setCharacterEncoding("EUC_KR");

		res.setContentType("text/html;charset=EUC_KR");
		PrintWriter out = res.getWriter();
		
		//client from data(QueryString :: name = value) ó�� ==> API Ȯ��
		String clientName = req.getParameter("name");
		String clientAddr = req.getParameter("addr");
	
		//client form data ��� 
		System.out.println(clientName+" : "+clientAddr);
		
		out.println("<html>");
		out.println("<head><title>PostData.java</title></head>");
		out.println("<body>");

		out.println("<h2>Post Test</h2>");
		out.println("<li>�̸� : "+clientName);
		out.println("<li>�ּ� : "+clientAddr);
		
		out.println("<p><p><a href='/edu/postData.html'>�ڷ�</a>");

		out.println("</body>");
		out.println("</html>");
	}
}//end of class