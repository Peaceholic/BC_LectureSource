<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head></head>
<body>
	:: 09JSPActionForward.jsp ���� <br/>
	<!-- 
		request Object scope �������� Ȯ��(Data ��������)
		request Object scope Data ���� :: response ��
		request Object scope Data ����Ұ� :: response ��
	-->
	<br/>Requset Object Scope ���� ���� : <%= request.getAttribute("aaa") %> <br/><br/>
	
	:: 09JSPActionForward.jsp �� <br/>
</body>
</html>