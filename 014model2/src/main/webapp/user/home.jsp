<%@page import="spring.model2.service.user.vo.UserVO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
 
 <% UserVO userVO = (UserVO)session.getAttribute("userVO"); %>
 
 <!-- #. �α����� ȸ�� -->
<!DOCTYPE html>
<html>
	<head></head>
	<body>
		<p>Simple Model2 Examples</p>
		<p>ȯ���մϴ�. : <%= userVO.getUserId() %>��</p>
		
		<br><br>
		<hr/>
		:: info <%= request.getAttribute("info") %>
		
	</body>
</html>