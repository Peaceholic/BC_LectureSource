<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<%@ page import = "jw04.UserVO" %>
<%@ page import = "jw04.UserDataSourceDao" %>

<%@ page isThreadSafe = "false" %>

<%
	request.setCharacterEncoding("EUC_KR");
	//response.setContentType("text/html;charset=EUC_KR");
	//PrintWriter out = res.getWriter();
	
	String id = request.getParameter("id");
	String pwd = request.getParameter("pwd");
	
	//HttpSession session = req.getSession(true);
		
	UserVO userVO = (UserVO)session.getAttribute("userVO");
	System.out.println("session에 저장된 UserVO 유무 화인 : "+userVO);
		
	if (!(id == null || "".equals(id))) {
		userVO = new UserVO();
		userVO.setId(id);
		userVO.setPwd(pwd);
	}
		
	UserDataSourceDao udsd = new UserDataSourceDao();
	udsd.getUser(userVO);
%>
<html>
<head></head>
<body>
	<h2>Login 화면</h2>
	<% if (userVO != null && userVO.isActive()) { %>
		<%= userVO.getId() %> 님 환영합니다.
		<% 
			session.setAttribute("userVO", userVO); 
		%>
	<% }else { %>
		login 실패 id,pwd를 확인하세요.
	<% } %>
	<p><p><a href='/edu/jw07/loginBeanDataSourceSessionJSP.html'>뒤로</a>
</body>
</html>