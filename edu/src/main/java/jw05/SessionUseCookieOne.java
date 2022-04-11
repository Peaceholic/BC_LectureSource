package jw05;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionUseCookieOne
 */
//@WebServlet("/SessionUseCookieOne")
public class SessionUseCookieOne extends HttpServlet {
	
    public SessionUseCookieOne() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		// 두가지 경우 이해
		//1. HttpSession 객체가 없을 경우
		//2. HttpSession 객체가 있을 경우
		HttpSession session = req.getSession(true);
		//==> 1의 경우 새로운 HttpSession 객체 생성(API 확인)
		//==> 2의 경우 기존 HttpSession 객체 GET(API 확인)
		
		if (session.isNew()) {
			session.setAttribute("name", new String("홍길동"));
			session.setAttribute("pwd", new String("1234"));
		}
		
		req.setCharacterEncoding("EUC_KR");
		res.setContentType("text/html;charset=EUC_KR");
		PrintWriter out = res.getWriter();
		
		out.println("<html><head></head>");
		out.println("<body>");
		out.println("<center><h2>SessionUseCookieOne</h2></center>");
		 
		System.out.println("\nUNIQUE한 JSESSIONID는 :: "+session.getId());
		
		if (session.isNew()) {
			out.println("세션이 새로 생성됨<br>");
		} else {
			out.println("\nUNIQUE한 JSESSIONID는 :: "+session.getId()+" 사용중");
		}
		
		out.println("<hr>");
		out.println("<p><p><a href='/edu/SessionUseCookieTwo'>링크</a>");
		out.println("</boyd>");
		out.println("</html>");
	}



}
