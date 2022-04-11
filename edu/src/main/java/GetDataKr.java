import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

/*
 FileName  : ServletTest.java
	ㅇ Servlet Life Cycle  이해 및 확인
*/
public class GetDataKr extends HttpServlet{
	
	//1.Client Get 방식으로 Request :: doGet() method O/R
	//2.service() O/R 가능
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		//한글 처리
		res.setContentType("text/html;charset=EUC_KR");
		PrintWriter out = res.getWriter();
		
		//client from data(QueryString :: name = value) 처리 ==> API 확인
		String clientName = req.getParameter("name");
		String clientAddr = req.getParameter("addr");

		String clientNameKo = this.convertKo(clientName);
		String clientAddrKo = this.convertKo(clientAddr);
	
		//client form data 출력 
		System.out.println(clientNameKo+" : "+clientAddrKo);
		
		out.println("<html>");
		out.println("<head><title>GetDataKr.java</title></head>");
		out.println("<body>");

		out.println("<h2>Get Test</h2>");
		out.println("<li>이름 : "+clientNameKo);
		out.println("<li>주소 : "+clientAddrKo);
		
		out.println("<p><p><a href='/edu/getDataKr.html'>뒤로</a>");

		out.println("</body>");
		out.println("</html>");
	}

	private String convertKo(String paramValue) {
		String convertParamValue = null;
		try {
			//==> API 확인
			byte[] b =paramValue.getBytes("8859_1");
			convertParamValue = new String(b, "EUC_KR");
		} catch (UnsupportedEncodingException uee) {
			System.out.println("한글 변환 중  Exception 발생");
			uee.printStackTrace();
		}
		return convertParamValue;
	}
}//end of class