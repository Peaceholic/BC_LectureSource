<%@page import="jw09.Client"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<% 
	request.setCharacterEncoding("EUC_KR"); 
	session.setAttribute("client", new Client());
%>

<%
	out.println("<h3>1. Scriptlet Tag 이용 session 저장 Bean(Data) 화면구성 </h3>");

	Client client = (Client)session.getAttribute("client");
	
	out.println("이름 : "+client.getName()+"<br/>");
	String[] info = client.getInfo();
	for(int i = 0; i<info.length; i++) {
		out.println("index["+i+"] : "+ info[i]+"<br/>");
	}
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

<h3> 2. EL 이용 session 저장 Bean(Data) 화면구성 </h3>

name : ${sessionScope.client.name} <br/>
addr : ${client.addr} <br/>
age : ${client.age} <br/>

info 배열은 empty : ${empty client.info} <br/>

info 배열의 index 0 value : ${sessionScope.client.info[0]} <br/>
info 배열의 index 0 value : ${client.info[1]} <br/>

</body>
</html>