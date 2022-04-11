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

<h3> taglib�� c:set, c:remove, c:out�� ��� </h3>

<c:set var="client" value="<%= new Client() %>" scope="session"/>

<h3>#��ũ��Ʈ�� �̿� ObjectScope�� ����� Bean ����</h3>
<%
	Client c = (Client)session.getAttribute("client");
	out.println("�̸� : " + c.getName()+"<br/>");
	out.println("�ּ� : " + c.getAddr()+"<br/>");
%>

<c:set var="test" value="${client}" scope="session"/>

<h3>#EL �̿� ObjectScope�� ����� Bean ����</h3>
1. session ObjectScope�� ����� client ��ü�� name : ${client.name}<br/>
1. session ObjectScope�� ����� test ��ü�� name : ${test.name}<br/>

<h3>#ObjectScope�� ����� test Bean setter Method ȣ��</h3>
<c:set target="${test}" property="name" value="�̼���"/>
2. session ObjectScope�� ����� client ��ü�� name : ${client.name}<br/>
2. session ObjectScope�� ����� test ��ü�� name : ${test.name}<br/>

<h3> c:out </h3>
<c:out value="${test.name}" default="null �Դϴ�"/>


<h3>#JSTL c:remove ObjectScope�� ����� test remove</h3>
 client before empty : ${empty sessionScope.client}<br/>
 <c:remove var="client" scope="session"/>
 client after empty : ${empty client}<br/>

 not remove test empty : ${empty test}<br/>

</body>
</html>