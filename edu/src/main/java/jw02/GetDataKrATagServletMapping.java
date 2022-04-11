package jw02;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

/*
 FileName  : ServletTest.java
	�� Servlet Life Cycle  ���� �� Ȯ��
*/
public class GetDataKrATagServletMapping extends HttpServlet{

	
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		//Servlet���� client�� Html ���� �� �ʼ� �ڵ�
		res.setContentType("text/html;charset=EUC_KR");
		PrintWriter out = res.getWriter();

		//Client Form Data ó��
		String clientName=req.getParameter("name");
		String clientAddr=req.getParameter("addr");

		//�ѱ� ���ڵ�
		String clientNameKO=convertKo(clientName);
		String clientAddrKO=this.convertKo(clientAddr);
		
		//Client Form Data ó�� ���Ȯ��
		System.out.println(clientNameKO+":"+clientAddrKO);

		out.println("<html>");
		out.println("<head><title>GetDataKrATagServletMapping.java</title></head>");
		out.println("<body>");

		out.println("<h2>Get Test</h2>");
		out.println("<li> �̸�:"+clientNameKO);
		out.println("<li> �ּ�:"+clientAddrKO);

		out.println("<p><p><a href='/edu/jw02/getDataKrATagServletMapping.html'>�ڷ�</a>");

		out.println("<p><a href='/edu/GetDataKrATagServletMapping?name=ȫ�浿&addr=����'>"+"�ڱ��ڽ�</a>");

		out.println("</body>");
		out.println("</html>");
	}

	private String convertKo(String paramValue){
	String convertParamValue = null;
	try{
	byte[] b=paramValue.getBytes("8859_1");
	convertParamValue = new String(b,"EUC_KR");
	}catch(UnsupportedEncodingException uee){
		System.out.println("�ѱ� ��ȯ �� Exception �߻�");
		uee.printStackTrace();
	}
	return convertParamValue;
	}
	

}//end of class