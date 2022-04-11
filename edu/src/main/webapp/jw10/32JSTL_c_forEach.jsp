<%@page import="java.util.HashMap"%>
<%@page import="java.util.Vector"%>
<%@page import="jw09.Client"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<% request.setCharacterEncoding("EUC_KR"); %>

<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

1. c:forEach �̿� Array ���۵Ǵ� ParamValues ���(begin=0, step=1�� ���)<br/>
	<c:forEach var="i" items="${paramValues.sw}" begin="0" step="1">
		�����Ͻ� SW�� : ${i}<br/>
	</c:forEach><br/>

2. c:forEach �̿� Array ���۵Ǵ� ParamValues ���(begin, step�� ���� ���)<br/>
	<c:forEach var="i" items="${paramValues.sw}">
		�����Ͻ� SW�� : ${i}<br/>
	</c:forEach><br/>
	
3. c:forEach �̿� Map���� ���۵Ǿ� ���� Param ���<br/>
	<c:forEach var="i" items="${param}">
		${i.key} : ${i.value}<br/>
	</c:forEach><br/>
	
4. c:forEach �̿� Map���� ���۵Ǿ� ���� Param ���<br/>
	<c:forEach var="i" items="${param}">
		<c:if test="${!empty param.name}">
			${param.name}���� ���̴� ${param.age}�Դϴ�.<br/>
		</c:if>
	</c:forEach><br/>
	
5. c:forEach �̿� Map���� ���۵Ǿ� ���� Param ���<br/>
	<c:forEach var="i" items="${param}">
		<c:if test="${i.key == 'name'}">
			${param.name}���� ���̴� ${param.age}�Դϴ�.<br/>
		</c:if>
	</c:forEach>
</body>
</html>