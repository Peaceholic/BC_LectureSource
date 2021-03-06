import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

/*
 FileName  : ServletTest.java
	ㅇ Servlet Life Cycle  이해 및 확인
*/
public class HelloServletdoGet extends HttpServlet{

	//init()
	
	//doGet() method Overriding
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		System.out.println(":: servlet doGet() 시작");
		System.out.println("Request Client IP : "+ req.getRemoteAddr());

		//한글 처리
		res.setContentType("text/html;charset=EUC_KR");

		//PrintWriter 인스턴스 생성을 Encapsulation한 API 사용 Stream 생성
		PrintWriter out = res.getWriter();

		out.println("<html>");
		out.println("<head><title>hello Servlet</title></head>");
		out.println("<body>");
		out.println("English : HelloServlet");
		out.println("<p>");
		out.println("Korea : 헬로 서블릿");	
		out.println("</body>");
		out.println("</html>");
		out.flush();
		out.close();

		System.out.println(":: servlet doGet() 종료\n");
	}
	
	// Web Application 이 shutdown 시 호출
//	public void destroy(){
//		System.out.println("destroy() : "+ ++destroyCount);
//	}

}//end of class