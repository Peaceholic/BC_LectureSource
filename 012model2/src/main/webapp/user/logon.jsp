<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<%@ page import="spring.model2.service.user.vo.UserVO" %>

<!-- 
1. �α��� ���� Ȯ�� :: Work Flow Control(����� �ڵ�)
  -��α��� : �α��� ȭ�� D.P
  -�α��� : �̹� �α��� �� ȸ������ D.P
 2. �α��� Ȯ����
  -�α����� ȸ���� session ObjectScope�� userVO��ü�� ���� active�� true
  -userVO ��ü�� ���� �� UserVO�� active�� true,false �Ǵ�
 -->

<%
UserVO userVO=(UserVO)session.getAttribute("userVO");
%>

<html>
<head></head>
<body>
<%if(userVO==null||userVO.isActive() != true){ %>

<form id="login" method="post" action="/012model2/logonAction.do">

���̵� : <input id="userId" type='text' name="userId" value=""><br/><br/>
�н����� : <input id="userId" type='text' name="userPasswd" value=""><br/><br/>
<input id="submit" type="submit" name="submit" value="Enter"/>
</form>

<%}else{ %>
<%=userVO.getUserId() %>���� �̹� �α��� �ϼ̽��ϴ�.
<%} %>

</body>
</html>