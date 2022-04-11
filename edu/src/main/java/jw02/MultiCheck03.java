package jw02;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MultiCheck03 extends HttpServlet {
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		
		res.setContentType("text/html;charset=EUC_KR");
		PrintWriter out = res.getWriter();
		
		out.println("<html>");
		out.println("<head></head>");
		out.println("<body><center><h2>Client에서 전송된 내용</h2></center><p>");

		Enumeration<String> en = req.getParameterNames();
		
		while(en.hasMoreElements()) {
			String name = en.nextElement();
			String[] value = req.getParameterValues(name);

			for(String s_value : value){
				out.println("<li> "+name+" : "+s_value);
            }
		}
		
		out.println("</body>");
		out.println("</html>");
	}
}
