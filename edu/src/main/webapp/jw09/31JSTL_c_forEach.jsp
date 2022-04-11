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

<h3> :: c:forEach 이용 구구단을 출력 </h3>
	1. c:forEach 이용 : 5단 출력<br/>
	<c:forEach var="i" begin="1" end="10" step="1">
		5 * ${i} = ${5*i}<br/>
	</c:forEach><br/><hr/>
	
	2. 증첩 c:forEach 이용 : 구구단 짝수 출력<br/>
	<c:forEach var="i" begin="2" end="9" step="2">
		[${i}]단을 출력합니다.
		<c:forEach var="j" begin="1" end="10" step="1">
		 	${i} * ${j} = ${i*j}<br/>		
		</c:forEach>
		<br/>
	</c:forEach><br/>
	
<h3> 3. index 관리 Collection 접근 </h3>
<%
	Vector vector = new Vector();
	vector.add("A");
	vector.add("B");
	vector.add("C");
	vector.add("D");
	
	System.out.println("==============");
	for(int i = 0; i<vector.size(); i++) {
		System.out.println(vector.get(i));
	}
	System.out.println("==============");
	for(Object obj : vector) {
		System.out.println(obj);
	}
%>

<c:forEach  var="i" items="<%= vector %>" begin="0" step="1" end="10">
	::Vector 저장정보 추출 : ${i}<br/>
</c:forEach>

<c:forEach  var="i" items="<%= vector %>" begin="1" step="1">
	::Vector 저장정보 추출 : ${i}<br/>
</c:forEach>

<c:forEach  var="i" items="<%= vector %>" begin="0" step="2">
	::Vector 저장정보 추출 : ${i}<br/>
</c:forEach>

<c:forEach  var="i" items="<%= vector %>" begin="0" step="1" end="1">
	::Vector 저장정보 추출 : ${i}<br/>
</c:forEach>

<h3> 4. key=value 형식의 map의 value 접근</h3><br/>
<%
	HashMap hashMap = new HashMap();
	hashMap.put("a", "A");
	hashMap.put("b", "B");
	hashMap.put("c", "C");
	hashMap.put("d", "D");
%>

<c:forEach  var="i" items="<%= hashMap %>">
	::HashMap에 저장된 내용은 : ${i.key} = ${i.value} <br/>
</c:forEach><br/><hr/>

<c:set var="aaa" value="<%= hashMap %>" />
<c:forEach  var="i" items="${aaa}">
	<c:if test="${i.key=='a'}">
		:: key a의 value : ${i.value} <br/>	
	</c:if>
</c:forEach><br/><hr/>

</body>
</html>