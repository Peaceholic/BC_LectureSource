package spring.base.objectscope;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

// 03RequestScopeTest.jsp ?? ????
public class RequestScopeTest extends HttpServlet{

	///Service()
	public void sevice(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		res.setContentType("text/html;charset=EUC_KR");
		PrintWriter out = res.getWriter();
		
		// 1. HttpSession ??ü GET
		HttpSession session = req.getSession(true);

		// 2. session Object Scope  "count" ????.
		Integer count = (Integer)session.getAttribute("count");

		// 3. ???ٸ?..
		//==> name : "count"  value : new Integer(1)  
		if(count == null){
			out.println(" :: Browser ?Ѱ? 1 ??° ?湮 ::");
			session.setAttribute("count",new Integer(1));
		}
		
		// 4. ?ִٸ?..
		//==> session ObjectScope  ?????? ????
		//==> count ???? ????(+1)  ?ٽ? session ObjectScope ????
		else{
			int changeCount = count.intValue()+1;
			out.println(":: Browser ?Ѱ? "+changeCount+" ??° ?湮 ::");

			session.setAttribute("count",new Integer(changeCount) );
		}		
	}
	
}

