<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@page import="spring.model2.service.user.vo.UserVO" %>
<!-- 
	1. �α��� ����Ȯ�� :: Work Flow Control (����� �ڵ�)
		�� �α��� : �α��� ȭ�� display
		�α��� : �̹� �α��� �� ȸ������ display
	2. �α��� Ȯ����...
		�α����� ȸ���� session ObjectScope�� UserVO ��ü�� ����, active�� true
		UserVO ��ü�� ���� �� UserVO�� active �� true/false �Ǵ�
 -->
 <%
 	//UserVO userVO = (UserVO)session.getAttribute("userVO");
 %>
 
<!DOCTYPE html>
<html>
	<head></head>
	<body>
	
		<form id="login" method="Post" action="/013model2/logonAction.do">
			���̵� : <input id="userId" type="text" name="userId" value=""><br><br>
			�н����� : <input id="userPwd" type="text" name="userPasswd" value=""><br><br>
			<input id="submit" type="submit" name="submit" value="Enter"/>
		</form>
	
	</body>
</html>