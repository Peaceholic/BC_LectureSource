<%@page import="jw09.Client"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

<h3> taglib의 c:set, c:remove, c:out을 사용 </h3>

<c:set var="client" value="<%= new Client() %>" scope="session"/>

<h3>#스크립트렛 이용 ObjectScope에 저장된 Bean 접근</h3>
<%
	Client c = (Client)session.getAttribute("client");
	out.println("이름 : " + c.getName()+"<br/>");
	out.println("주소 : " + c.getAddr()+"<br/>");
%>

<c:set var="test" value="${client}" scope="session"/>

<h3>#EL 이용 ObjectScope에 저장된 Bean 접근</h3>
1. session ObjectScope에 저장된 client 객체의 name : ${client.name}<br/>
1. session ObjectScope에 저장된 test 객체의 name : ${test.name}<br/>

<h3>#ObjectScope에 저장된 test Bean setter Method 호출</h3>
<c:set target="${test}" property="name" value="이순신"/>
2. session ObjectScope에 저장된 client 객체의 name : ${client.name}<br/>
2. session ObjectScope에 저장된 test 객체의 name : ${test.name}<br/>

<h3> c:out </h3>
<c:out value="${test.name}" default="null 입니다"/>


<h3>#JSTL c:remove ObjectScope에 저장된 test remove</h3>
 client before empty : ${empty sessionScope.client}<br/>
 <c:remove var="client" scope="session"/>
 client after empty : ${empty client}<br/>

 not remove test empty : ${empty test}<br/>

</body>
</html>