<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<%@ page import="spring.model1.service.user.vo.UserVO"%>
<%@ page import="spring.model1.service.user.dao.UserDao"%>

<%
UserVO userVO=(UserVO)session.getAttribute("userVO");
if(userVO==null){
	userVO=new UserVO();
	}
	%>
	
<!-- 로그인한 회원 -->	
<% if(userVO.isActive()){%>
	<jsp:forward page="home.jsp"/>
	<%}%>
	
<!-- 미로그인 회원 -->
<%
//한글처리
request.setCharacterEncoding("euc-kr");

//Client FormData 처리
String userId=request.getParameter("userId");
String userPasswd=request.getParameter("userPasswd");

//Navigation default page 지정
String targetAction="/user/logon.jsp";

//Client FormData Value Object Binding
userVO.setUserId(userId);
userVO.setUserPasswd(userPasswd);

//DAO 이용 DB확인
UserDao userDAO=new UserDao();
userDAO.getUser(userVO);

//로그인유무 확인
if(userVO.isActive()){
session.setAttribute("userVO",userVO);
targetAction="/user/home.jsp";
}
%>

<!-- Navigation -->
<jsp:forward page='<%=targetAction %>'/>