package jw02;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

/*
 FileName  : ServletTest.java
	ㅇ Servlet Life Cycle  이해 및 확인
*/
public class GetDataKrATagServletMapping extends HttpServlet{

	
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		//Servlet에서 client로 Html 전송 시 필수 코딩
		res.setContentType("text/html;charset=EUC_KR");
		PrintWriter out = res.getWriter();

		//Client Form Data 처리
		String clientName=req.getParameter("name");
		String clientAddr=req.getParameter("addr");

		//한글 디코딩
		String clientNameKO=convertKo(clientName);
		String clientAddrKO=this.convertKo(clientAddr);
		
		//Client Form Data 처리 출력확인
		System.out.println(clientNameKO+":"+clientAddrKO);

		out.println("<html>");
		out.println("<head><title>GetDataKrATagServletMapping.java</title></head>");
		out.println("<body>");

		out.println("<h2>Get Test</h2>");
		out.println("<li> 이름:"+clientNameKO);
		out.println("<li> 주소:"+clientAddrKO);

		out.println("<p><p><a href='/edu/jw02/getDataKrATagServletMapping.html'>뒤로</a>");

		out.println("<p><a href='/edu/GetDataKrATagServletMapping?name=홍길동&addr=서울'>"+"자기자신</a>");

		out.println("</body>");
		out.println("</html>");
	}

	private String convertKo(String paramValue){
	String convertParamValue = null;
	try{
	byte[] b=paramValue.getBytes("8859_1");
	convertParamValue = new String(b,"EUC_KR");
	}catch(UnsupportedEncodingException uee){
		System.out.println("한글 변환 중 Exception 발생");
		uee.printStackTrace();
	}
	return convertParamValue;
	}
	

}//end of class