<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
 
<%@ page import="homework03.UserVO" %>
<%@ page import="homework03.UserDao" %>

 
<%	
	request.setCharacterEncoding("EUC_KR");
	response.setContentType("text/html;charset=EUC_KR");
	
	// Client���� �Ѿ�� ��
	String name = request.getParameter("name");

	// Session ����
	// Name �� Null�� ���
	// <a href='/homework03/homework03/FindUser'> ȸ������ ���� (Session)</a>
	if(name == null){
		session = request.getSession(true);
		name = ((UserVO)session.getAttribute("userVO")).getName();
	}
	
	//DB�� �����ϴ� UserDAO�� �̿� ȸ������ select ��
	UserDao bean = new UserDao();
	//==> ȸ���� ������ ���� userVO intance�� �ޱ�
	UserVO userVO = bean.findUser(name);
	
%>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
</head>
<body>
	
<h2>ȸ������</h2>
	
	
	<% if(userVO != null){ %>
	<%= userVO %> 
	<% session.invalidate(); %>
	<% }else{%>
	<%= name %> ȸ�������� �����ϴ�<br/>
	<% } %>
	
	<p><p><a href='/homework03/homework03/addUser.html'> ȸ������ ����</a>
	<p><p><a href='/homework03/homework03/findUser.html'> ȸ������ ��ȸ</a>
	<p><p><a href='/homework03/homework03/'> Folder �̵�</a>

</body>
</html>