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
	System.out.println("session�� ����� UserVO ���� ȭ�� : "+userVO);
		
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
	<h2>Login ȭ��</h2>
	<% if (userVO != null && userVO.isActive()) { %>
		<%= userVO.getId() %> �� ȯ���մϴ�.
		<% 
			session.setAttribute("userVO", userVO); 
		%>
	<% }else { %>
		login ���� id,pwd�� Ȯ���ϼ���.
	<% } %>
	<p><p><a href='/edu/jw07/loginBeanDataSourceSessionJSP.html'>�ڷ�</a>
</body>
</html>