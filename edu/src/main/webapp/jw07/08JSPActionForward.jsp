<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head></head>
<body>
	:: 08JSPActionForward.jsp ���� <br/>
	<% request.setAttribute("aaa", new String("�����")); %>
	<jsp:forward page ="09JSPActionForward.jsp" />
	
	:: 08JSPActionForward.jsp �� <br/>
</body>
</html>