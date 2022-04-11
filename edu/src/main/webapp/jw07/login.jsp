<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<%@ page import="jw.service.user.vo.UserVO" %>
<%@ page import="jw.service.user.dao.UserDao" %>

<!-- ����� �ڵ� / WorkFlow Control -->
<% if(request.getMethod().equals("GET")) { %>
	<%-- <jsp:forward page="login.html"/> ���ƾƾƾ� �ּ� JSP �ּ�!!!!! --%>
	<% response.sendRedirect("login.html"); %>
<% } %>

<%
	request.setCharacterEncoding("EUC_KR");

	//Client Form Data ó��
	String id = request.getParameter("id");
	String pwd = request.getParameter("pwd");
	//UserVO instance ���� �� Client Form Data ����(Binding)
	UserVO userVO = new UserVO();
	userVO.setId(id);
	userVO.setPwd(pwd);
	
	//DB ���� Data �˻� �� UserVO.active true/false ����
	UserDao userDAO = new UserDao();
	userDAO.getUser(userVO);
%>

<html>
<head></head>
<body>
<h2>Login ȭ��</h2>
	<% if (userVO.isActive()) { %>
		<%= id %> �� ȯ���մϴ�.
		<% session.setAttribute("userVO", userVO); %>
	<% }else { %>
		login ���� id,pwd�� Ȯ���ϼ���.
	<% } %>
	<p><p><a href='./login.html'>�ڷ�</a>
</body>
</html>