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
		
		// �ΰ��� ��� ����
		//1. HttpSession ��ü�� ���� ���
		//2. HttpSession ��ü�� ���� ���
		HttpSession session = req.getSession(true);
		//==> 1�� ��� ���ο� HttpSession ��ü ����(API Ȯ��)
		//==> 2�� ��� ���� HttpSession ��ü GET(API Ȯ��)
		
		if (session.isNew()) {
			session.setAttribute("name", new String("ȫ�浿"));
			session.setAttribute("pwd", new String("1234"));
		}
		
		req.setCharacterEncoding("EUC_KR");
		res.setContentType("text/html;charset=EUC_KR");
		PrintWriter out = res.getWriter();
		
		out.println("<html><head></head>");
		out.println("<body>");
		out.println("<center><h2>SessionUseCookieOne</h2></center>");
		 
		System.out.println("\nUNIQUE�� JSESSIONID�� :: "+session.getId());
		
		if (session.isNew()) {
			out.println("������ ���� ������<br>");
		} else {
			out.println("\nUNIQUE�� JSESSIONID�� :: "+session.getId()+" �����");
		}
		
		out.println("<hr>");
		out.println("<p><p><a href='/edu/SessionUseCookieTwo'>��ũ</a>");
		out.println("</boyd>");
		out.println("</html>");
	}



}
