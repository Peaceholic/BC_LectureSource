<%@page import="spring.model2.service.user.vo.UserVO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
 
 <% UserVO userVO = (UserVO)session.getAttribute("userVO"); %>
 
 <!-- #. 로그인한 회원 -->
<!DOCTYPE html>
<html>
	<head></head>
	<body>
		<p>Simple Model2 Examples</p>
		<p>환영합니다. : <%= userVO.getUserId() %>님</p>
		
		<br><br>
		<hr/>
		:: info <%= request.getAttribute("info") %>
		
	</body>
</html>