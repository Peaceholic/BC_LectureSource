import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

/*
 FileName  : ServletTest.java
	�� Servlet Life Cycle  ���� �� Ȯ��
*/
public class GetData extends HttpServlet{
	
	//1.Client Get ������� Request :: doGet() method O/R
	//2.service() O/R ����
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		//�ѱ� ó��
		res.setContentType("text/html;charset=EUC_KR");
		PrintWriter out = res.getWriter();
		
		//client from data(QueryString :: name = value) ó�� ==> API Ȯ��
		String clientName = req.getParameter("name");
		String clientAddr = req.getParameter("addr");
	
		//client form data ��� 
		System.out.println(clientName+" : "+clientAddr);
		
		out.println("<html>");
		out.println("<head><title>GetData.java</title></head>");
		out.println("<body>");

		out.println("<h2>Get Test</h2>");
		out.println("<li>�̸� : "+clientName);
		out.println("<li>�ּ� : "+clientAddr);
		
		out.println("<p><p><a href='/edu/getData.html'>�ڷ�</a>");

		out.println("</body>");
		out.println("</html>");
	}
}//end of class