package spring.model2.control;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import spring.model2.service.user.vo.UserVO;
import spring.model2.service.user.dao.UserDao;

public class ControlServlet extends HttpServlet {
	
	public void init(ServletConfig sc) throws ServletException {
		
		super.init(sc);
		//web.xml ����
		System.out.println("\n\n =========================");
		System.out.println("ControlServlet - init()");
		System.out.println(" =========================");
		
	}
	
	public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
		
		System.out.println("\n[ControlServlet.service() Start]");
		
		// Client �䱸���� �Ǵ� url/uri �̿�
		String actionPage = this.getURI(req.getRequestURI());
		System.out.println(" URI : "+req.getRequestURI());
		System.out.println(" Client �䱸���� : "+actionPage);
		
		//// controller >> ��ó�� / ����ó��
		// �� ���� - �ѱ�ó��, session����, ��/���� ó��
		req.setCharacterEncoding("euc-kr");
		HttpSession session = req.getSession(true);
		
		// controller navigation
		// defalt page ����
		String requestPage = "/user/logon.jsp";
		
		//// controller >> ���� / ���� ó��
		// 1. session object scope�� userVO ���� ����
		if(session.isNew() || session.getAttribute("userVO")==null ) {
			session.setAttribute("userVO", new UserVO());
		}		
		
		// 2. session object scope userVO ����
		UserVO userVO = (UserVO) session.getAttribute("userVO");
		
		// UserVO.active �̿� �α��� ���� �Ǵ�
		if( userVO != null && userVO.isActive()) {
			requestPage = "/user/home.jsp";
		}
		
		//// Controller >> Client �䱸���� ó�� Business Layer ����
		// 1. logon.do ��� 
		// B/L �� �� ���� 
		// default page �� forward
		else if(actionPage.equals("logon")) {
			
			
		}
		
		// 2. logonAction.do ���
		// client form data ó��
		// client form data �� B/L �� ������ ���� VO Binding
		// B/L method ȣ�� �� ��� �� �޾� View���� ��� �� �� �ֵ��� OjectScope�� ���� 
		// Model - view ����
		else if(actionPage.equals("logonAction")) {			
			
			// Client Form Data ó��
			String userId = req.getParameter("userId");
			String userPasswd = req.getParameter("userPasswd");

			// Model - view ���� Binding
			userVO.setUserId(userId);
			userVO.setUserPasswd(userPasswd);
			
			// B/L ó��
			UserDao useDao = new UserDao();
			useDao.getUser(userVO);	
			
			// navigation
			if( userVO.isActive() ) {
				requestPage = "/user/home.jsp";				
			}
		}
		
		// 3. home.do ���
		// �� �α��� ȸ���� home.do Request > default request page �� forward
		else if(actionPage.equals("home")) {
			
		}
		
		System.out.println("���� ���� �� View page�� : [[" + requestPage+ ".jsp ]]");
		
		// Controller > navigation (���� ������ page)
		ServletContext sc = this.getServletContext();
		RequestDispatcher rd = sc.getRequestDispatcher(requestPage);
		rd.forward(req, res);
		
		System.out.println("\n[ControlServlet.service() End ]");
		
	}//end of service
	
	//Client �䱸 �Ǵ� URL Parsing
	private String getURI(String requestURI) {
		
		int start = requestURI.lastIndexOf('/')+1;
		int end = requestURI.lastIndexOf(".do");
		String actionPage = requestURI.substring(start, end);		
		
		return actionPage;
	}
	
}//end of class
