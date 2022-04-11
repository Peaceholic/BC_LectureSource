<%@page import="java.util.HashMap"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
   // 1. page ObjectScope 저장
   pageContext.setAttribute("abc",new String("page ObjectScope 저장된 문자열"));
   
   // 2. request ObjectScope 저장
   request.setAttribute("abc",new String("request ObjectScope 저장된 문자열"));
   
   //3.1 session ObjectScope  (size() ==0인)  ArrayList 저장
   session.setAttribute("abc",new ArrayList());
   
   // 3.2 session ObjectScope 값을 갖는 ArrayList 저장
   ArrayList arrayList =new ArrayList();
   arrayList.add( new String("ArrayList  저장된 문자열") );
   session.setAttribute("def",arrayList);
   
   // 4. Application ObjectScope 값을 갖는 HashMap 저장
   HashMap hashMap = new HashMap();
   hashMap.put("zzz",new String("HashMap 저장된 문자열"));
   application.setAttribute("abc",hashMap);
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

<h5>1. page ObjectScope 접근 </h5>
	${pageScope.abc} = ${pageScope["abc"]}
	
<h5>2. request ObjectScope 접근 </h5>
	${requestScope.abc} = ${requestScope["abc"]}
	
<h5>3. session ObjectScope 접근 </h5>
	${empty sessionScope.abc} = ${empty sessionScope["abc"]}

<h5>3-1. session ObjectScope 접근 </h5>
	${empty sessionScope.def} = ${empty sessionScope["def"]}
	
<h5>3-2. session ObjectScope 접근 </h5>
	${sessionScope.def[0]} = ${sessionScope["def"][0]}

<h5>4. application ObjectScope 접근 </h5>
	${applicationScope.abc} = ${applicationScope["abc"]}

<h5>4-1. application ObjectScope 접근 </h5>
	${applicationScope.abc.zzz} = ${applicationScope["abc"].zzz}
	
<h5>page => request => session => application 우선순위 </h5>
${abc}

</body>
</html>