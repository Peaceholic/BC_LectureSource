<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@page import="spring.model2.service.user.vo.UserVO" %>
<!-- 
	1. 로그인 유무확인 :: Work Flow Control (방어적 코딩)
		비 로그인 : 로그인 화면 display
		로그인 : 이미 로그인 한 회원임을 display
	2. 로그인 확인은...
		로그인한 회원은 session ObjectScope에 UserVO 객체를 갖고, active는 true
		UserVO 객체의 유무 및 UserVO의 active 값 true/false 판단
 -->
 <%
 	//UserVO userVO = (UserVO)session.getAttribute("userVO");
 %>
 
<!DOCTYPE html>
<html>
	<head></head>
	<body>
	
		<form id="login" method="Post" action="/013model2/logonAction.do">
			아이디 : <input id="userId" type="text" name="userId" value=""><br><br>
			패스워드 : <input id="userPwd" type="text" name="userPasswd" value=""><br><br>
			<input id="submit" type="submit" name="submit" value="Enter"/>
		</form>
	
	</body>
</html>