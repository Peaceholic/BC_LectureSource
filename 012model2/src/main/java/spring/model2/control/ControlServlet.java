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
		//web.xml 설정
		System.out.println("\n\n =========================");
		System.out.println("ControlServlet - init()");
		System.out.println(" =========================");
		
	}
	
	public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
		
		System.out.println("\n[ControlServlet.service() Start]");
		
		// Client 요구사항 판단 url/uri 이용
		String actionPage = this.getURI(req.getRequestURI());
		System.out.println(" URI : "+req.getRequestURI());
		System.out.println(" Client 요구사항 : "+actionPage);
		
		//// controller >> 선처리 / 공통처리
		// 본 예제 - 한글처리, session관리, 선/공통 처리
		req.setCharacterEncoding("euc-kr");
		HttpSession session = req.getSession(true);
		
		// controller navigation
		// defalt page 설정
		String requestPage = "/user/logon.jsp";
		
		//// controller >> 권한 / 인증 처리
		// 1. session object scope에 userVO 생성 저장
		if(session.isNew() || session.getAttribute("userVO")==null ) {
			session.setAttribute("userVO", new UserVO());
		}		
		
		// 2. session object scope userVO 추출
		UserVO userVO = (UserVO) session.getAttribute("userVO");
		
		// UserVO.active 이용 로그인 유무 판단
		if( userVO != null && userVO.isActive()) {
			requestPage = "/user/home.jsp";
		}
		
		//// Controller >> Client 요구사항 처리 Business Layer 접근
		// 1. logon.do 경우 
		// B/L 할 것 없음 
		// default page 로 forward
		else if(actionPage.equals("logon")) {
			
			
		}
		
		// 2. logonAction.do 경우
		// client form data 처리
		// client form data 를 B/L 로 보내기 위한 VO Binding
		// B/L method 호출 및 결과 값 받아 View에서 사용 할 수 있도록 OjectScope에 저장 
		// Model - view 연결
		else if(actionPage.equals("logonAction")) {			
			
			// Client Form Data 처리
			String userId = req.getParameter("userId");
			String userPasswd = req.getParameter("userPasswd");

			// Model - view 연결 Binding
			userVO.setUserId(userId);
			userVO.setUserPasswd(userPasswd);
			
			// B/L 처리
			UserDao useDao = new UserDao();
			useDao.getUser(userVO);	
			
			// navigation
			if( userVO.isActive() ) {
				requestPage = "/user/home.jsp";				
			}
		}
		
		// 3. home.do 경우
		// 비 로그인 회원이 home.do Request > default request page 로 forward
		else if(actionPage.equals("home")) {
			
		}
		
		System.out.println("최종 결정 된 View page는 : [[" + requestPage+ ".jsp ]]");
		
		// Controller > navigation (최종 결정된 page)
		ServletContext sc = this.getServletContext();
		RequestDispatcher rd = sc.getRequestDispatcher(requestPage);
		rd.forward(req, res);
		
		System.out.println("\n[ControlServlet.service() End ]");
		
	}//end of service
	
	//Client 요구 판단 URL Parsing
	private String getURI(String requestURI) {
		
		int start = requestURI.lastIndexOf('/')+1;
		int end = requestURI.lastIndexOf(".do");
		String actionPage = requestURI.substring(start, end);		
		
		return actionPage;
	}
	
}//end of class
