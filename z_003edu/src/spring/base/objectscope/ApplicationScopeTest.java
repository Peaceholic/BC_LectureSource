package spring.base.objectscope;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 02ApplicationScopeTest.jsp 와 비교

public class ApplicationScopeTest extends HttpServlet {

	///Service()
	public void sevice(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		response.setContentType("text/html;charset=EUC_KR");
		PrintWriter out = response.getWriter();
		
		// 1. getServletContext (application 내장 겍체) GET
		Integer count = (Integer)request.getAttribute("count");

		// 2. 없다면..
		//==> name : "count"  value : new Integer(1)  
		if(count == null){
			out.println(" :: Browser 켜고 1 번째 방문 ::");
			request.setAttribute("count",new Integer(1));
		}
		
		// 3. 있다면..
		//==> application ObjectScope  추출한 출력
		//==> count 값을 증가(+1)  다시 application ObjectScope 저장
		else{
			int changeCount = count.intValue()+1;
			out.println(":: Browser 켜고 "+changeCount+" 번째 방문 ::");

			request.setAttribute("count",new Integer(changeCount) );
		}		
	}
	
}
