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
	
<!-- �α����� ȸ�� -->	
<% if(userVO.isActive()){%>
	<jsp:forward page="home.jsp"/>
	<%}%>
	
<!-- �̷α��� ȸ�� -->
<%
//�ѱ�ó��
request.setCharacterEncoding("euc-kr");

//Client FormData ó��
String userId=request.getParameter("userId");
String userPasswd=request.getParameter("userPasswd");

//Navigation default page ����
String targetAction="/user/logon.jsp";

//Client FormData Value Object Binding
userVO.setUserId(userId);
userVO.setUserPasswd(userPasswd);

//DAO �̿� DBȮ��
UserDao userDAO=new UserDao();
userDAO.getUser(userVO);

//�α������� Ȯ��
if(userVO.isActive()){
session.setAttribute("userVO",userVO);
targetAction="/user/home.jsp";
}
%>

<!-- Navigation -->
<jsp:forward page='<%=targetAction %>'/>