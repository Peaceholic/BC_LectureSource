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

<h3> EL ���尴ü�� ��� </h3>
1. pageContext requestURI : ${pageContext.request.requestURI} <br/>

2. pageContext session�� id : ${pageContext.session.id} <br/>

3. Expression Tag : <%= pageContext.getSession().getId() %> <br/>

4. �̸� : <%= request.getParameter("name") %> <br/>

5. �ּ� : ${param.addr}<br/>

<% String[] sw = request.getParameterValues("sw"); %>


6. <%= sw[0] %><br/>
6. ${paramValues.sw[1]}<br/>
6. ${paramValues.sw[2]}<br/>

 
<h3> EL Cookie ���尴ü : Map ���� </h3>
7. ��Ű name : ${cookie.JSESSIONID.name}<br/>
7. ��Ű value : ${cookie.JSESSIONID.value}<br/>


</body>
</html>