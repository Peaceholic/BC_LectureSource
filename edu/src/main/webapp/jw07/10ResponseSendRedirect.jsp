<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head></head>
<body>
	:: 10ResponseSendRedirect.jsp 시작 <br/>
	<% request.setAttribute("aaa", new String("연결됨")); %>
	<!-- response.sendRedirect()는 URL, URI, Relative URI 사용 가능 -->
	<% response.sendRedirect("09JSPActionForward.jsp"); %>
	<% //response.sendRedirect("http://127.0.0.1:8080/edu/jw07/09JSPActionForward.jsp"); %>
	<% //response.sendRedirect("http://www.daum.net"); %>
	
	:: 10ResponseSendRedirect.jsp 끝 <br/>
</body>
</html>