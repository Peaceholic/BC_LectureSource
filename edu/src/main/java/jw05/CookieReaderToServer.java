package jw05;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * FileName : CookieWriterToClient.java
 *	:: Client 에 필요정보를 저장하는 Cookie 사용
*/
//@WebServlet("/CookieWriterToClient")
public class CookieReaderToServer extends HttpServlet{

	public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		
		req.setCharacterEncoding("EUC_KR");
		res.setContentType("text/html;charset=EUC_KR");
		PrintWriter out = res.getWriter();

		//client로 부터 전송된 Cookie 처리
		Cookie[] cookies = req.getCookies();
		//cookie의 name=value 처리 변수
		String userName = null;
		
		if (cookies != null) {
			out.println("Client에서 전송된 Cookie가 있습니다.<br/>");
			for (int i = 0;i<cookies.length; i++) {
				String name = cookies[i].getName();
				String value = URLDecoder.decode(cookies[i].getValue());
				System.out.println("client로 부터 전송된 cookie : "+name+"="+value);
				
				if (name.equals("name")) {
					userName = value;
				}
			}
		} else {
			out.println("client에서 전송된 cookie가 없습니다. <br/>");
		}
		
        out.println("<html><body>");
		if (userName == null) {
			out.println("처음입니다.");
		} else {
			out.println(userName+"님 환영");
		}
        
		out.println("</body></html>");
	}

}//end of class