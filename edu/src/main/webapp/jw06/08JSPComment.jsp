<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head></head>
<body>
	1. 주석문 연습입니다.<br>
	
	<%
		String str1 = "주석 1";
		String str2 = "주석 2";
	%>
	
	<!-- 
		<%= str1 %>
		나는 html  주석입니다.
	-->
	
	<!-- 
		<%= str2 %>
		나는 html  주석입니다.
	-->
	
	<%-- 
		나는 jsp 주석입니다.
	--%>
	
	<%
		//주석처리만 했음.
		//개행처리만 하면
	%>
</body>
</html>