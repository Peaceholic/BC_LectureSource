package spring.base.objectscope;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 02ApplicationScopeTest.jsp �� ��

public class ApplicationScopeTest extends HttpServlet {

	///Service()
	public void sevice(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		response.setContentType("text/html;charset=EUC_KR");
		PrintWriter out = response.getWriter();
		
		// 1. getServletContext (application ���� ��ü) GET
		Integer count = (Integer)request.getAttribute("count");

		// 2. ���ٸ�..
		//==> name : "count"  value : new Integer(1)  
		if(count == null){
			out.println(" :: Browser �Ѱ� 1 ��° �湮 ::");
			request.setAttribute("count",new Integer(1));
		}
		
		// 3. �ִٸ�..
		//==> application ObjectScope  ������ ���
		//==> count ���� ����(+1)  �ٽ� application ObjectScope ����
		else{
			int changeCount = count.intValue()+1;
			out.println(":: Browser �Ѱ� "+changeCount+" ��° �湮 ::");

			request.setAttribute("count",new Integer(changeCount) );
		}		
	}
	
}
