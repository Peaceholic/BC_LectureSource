<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<%@ page import="spring.model2.service.user.vo.UserVO" %>

<%UserVO userVO=(UserVO)session.getAttribute("userVO"); %>


<%if(userVO==null || !userVO.isActive()){ %>
<%-- <jsp:forward page="logon.jsp"/> --%>

<%} %>

<!-- 로그인한 회원 -->
<html>
<head></head>
<body>
<p>Simple Model2 Examples</p>
<p>환영합니다. : <%=userVO.getUserId() %>님</p>
</body>
</html>