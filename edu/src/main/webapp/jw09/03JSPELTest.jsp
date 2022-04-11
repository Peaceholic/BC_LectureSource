<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<% request.setCharacterEncoding("EUC_KR"); %>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

<h3> EL 내장객체를 사용 </h3>
1. pageContext requestURI : ${pageContext.request.requestURI} <br/>

2. pageContext session의 id : ${pageContext.session.id} <br/>

3. Expression Tag : <%= pageContext.getSession().getId() %> <br/>

4. 이름 : <%= request.getParameter("name") %> <br/>

5. 주소 : ${param.addr}<br/>

<% String[] sw = request.getParameterValues("sw"); %>


6. <%= sw[0] %><br/>
6. ${paramValues.sw[1]}<br/>
6. ${paramValues.sw[2]}<br/>

 
<h3> EL Cookie 내장객체 : Map 형식 </h3>
7. 쿠키 name : ${cookie.JSESSIONID.name}<br/>
7. 쿠키 value : ${cookie.JSESSIONID.value}<br/>


</body>
</html>