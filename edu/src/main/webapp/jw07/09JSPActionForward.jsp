<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head></head>
<body>
	:: 09JSPActionForward.jsp 시작 <br/>
	<!-- 
		request Object scope 공유유무 확인(Data 추출유무)
		request Object scope Data 추출 :: response 전
		request Object scope Data 추출불가 :: response 후
	-->
	<br/>Requset Object Scope 공유 유무 : <%= request.getAttribute("aaa") %> <br/><br/>
	
	:: 09JSPActionForward.jsp 끝 <br/>
</body>
</html>