<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
 
<%@ page import="homework03.UserVO" %>
<%@ page import="homework03.UserDao" %>

 
<%	
	request.setCharacterEncoding("EUC_KR");
	response.setContentType("text/html;charset=EUC_KR");
	
	// Client에서 넘어온 값
	String name = request.getParameter("name");

	// Session 영역
	// Name 이 Null인 경우
	// <a href='/homework03/homework03/FindUser'> 회원정보 보기 (Session)</a>
	if(name == null){
		session = request.getSession(true);
		name = ((UserVO)session.getAttribute("userVO")).getName();
	}
	
	//DB에 접근하는 UserDAO를 이용 회원정보 select 후
	UserDao bean = new UserDao();
	//==> 회원의 정보를 갖는 userVO intance로 받기
	UserVO userVO = bean.findUser(name);
	
%>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
</head>
<body>
	
<h2>회원정보</h2>
	
	
	<% if(userVO != null){ %>
	<%= userVO %> 
	<% session.invalidate(); %>
	<% }else{%>
	<%= name %> 회원정보가 없습니다<br/>
	<% } %>
	
	<p><p><a href='/homework03/homework03/addUser.html'> 회원정보 가입</a>
	<p><p><a href='/homework03/homework03/findUser.html'> 회원정보 조회</a>
	<p><p><a href='/homework03/homework03/'> Folder 이동</a>

</body>
</html>