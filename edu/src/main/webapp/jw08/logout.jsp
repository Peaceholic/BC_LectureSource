<%@page import="jw.service.user.vo.UserVO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<%
	UserVO userVO = (UserVO)session.getAttribute("userVO");
	if(userVO == null) {
		userVO = new UserVO();
	}
%>
<% if(!userVO.isActive()) {%>
	<jsp:include page="../jw07/login.html"/><br><br>
	<a href="/edu/jw07/addUser.html">회원가입</a>
<% } else { %>
	<%= userVO.getId() %>님 로그인 하셨습니다.<br><br>
	<form method="Post" action="<%= request.getRequestURL() %>">
		URL:<%= request.getRequestURL() %> <br>
		URI:<%= request.getRequestURI() %> <br>	
		<input type="submit" value="Logout"/>
	</form>
	<br><br>
<% } %>

<%
	if(request.getMethod().equals("POST")) {
		//session.invalidate();
		
		//session.removeAttribute("userVO");
		
		userVO.setActive(false);
		
		response.sendRedirect("./logout.jsp");
	}
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

</body>
</html>