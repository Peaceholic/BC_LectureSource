import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

/*
 FileName  : ServletTest.java
	�� Servlet Life Cycle  ���� �� Ȯ��
*/
public class GetDataKr extends HttpServlet{
	
	//1.Client Get ������� Request :: doGet() method O/R
	//2.service() O/R ����
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		//�ѱ� ó��
		res.setContentType("text/html;charset=EUC_KR");
		PrintWriter out = res.getWriter();
		
		//client from data(QueryString :: name = value) ó�� ==> API Ȯ��
		String clientName = req.getParameter("name");
		String clientAddr = req.getParameter("addr");

		String clientNameKo = this.convertKo(clientName);
		String clientAddrKo = this.convertKo(clientAddr);
	
		//client form data ��� 
		System.out.println(clientNameKo+" : "+clientAddrKo);
		
		out.println("<html>");
		out.println("<head><title>GetDataKr.java</title></head>");
		out.println("<body>");

		out.println("<h2>Get Test</h2>");
		out.println("<li>�̸� : "+clientNameKo);
		out.println("<li>�ּ� : "+clientAddrKo);
		
		out.println("<p><p><a href='/edu/getDataKr.html'>�ڷ�</a>");

		out.println("</body>");
		out.println("</html>");
	}

	private String convertKo(String paramValue) {
		String convertParamValue = null;
		try {
			//==> API Ȯ��
			byte[] b =paramValue.getBytes("8859_1");
			convertParamValue = new String(b, "EUC_KR");
		} catch (UnsupportedEncodingException uee) {
			System.out.println("�ѱ� ��ȯ ��  Exception �߻�");
			uee.printStackTrace();
		}
		return convertParamValue;
	}
}//end of class