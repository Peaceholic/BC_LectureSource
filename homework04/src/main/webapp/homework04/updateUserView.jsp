<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
 
<%@ page import="homework04.UserVO" %>
<%@ page import="homework04.UserDao" %>

<% UserVO userVO = (UserVO)session.getAttribute("userVO"); %>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
</head>
<body>

<form method="post" action="updateUser.jsp" >

	<h2>&nbsp;&nbsp;&nbsp;&nbsp; Update User </h2>
		
# DB-TableName &nbsp; : &nbsp; memberhw01
<br><br>	
    
[ Number ] &nbsp;&nbsp;&nbsp; (regNum) &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
* ��Ϲ�ȣ : &nbsp;&nbsp;&nbsp;
<input type="text" name="regNum" value="<%= userVO.getRegNum() %>"/>
<br><br>

[ Varchar2 ] &nbsp; (type) &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
* ���� : &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<select name=type >
<option>�����</option>
<option>������</option>
</select>
<br><br>

[ Varchar2 ] &nbsp; (id) &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
* ID : &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<input type="text" name="id" value="<%= userVO.getId() %>"/>
<br><br>
        
[ Varchar2 ] &nbsp; (pw) &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
* PW : &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<input type="text" name="pw" value="<%= userVO.getPw() %>"/>
<br><br>

[ Varchar2 ] &nbsp; (name) &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
* �̸� : &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<input type="text" name="name" value="<%= userVO.getName() %>"/>
<br><br>
        
[ Varchar2 ] &nbsp; (gender) &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
* ���� : &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
���� <input type="radio" name="gender" checked />
���� <input type="radio" name="gender" />
<br><br>


[ Number ] &nbsp;&nbsp;&nbsp; (phone 1, 2, 3) &nbsp;&nbsp;
* ����ó : &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<span><input type="text" name="phone1" value="<%= userVO.getPhone1() %>"/></span>&nbsp;&nbsp; - &nbsp;&nbsp;
<span><input type="text" name="phone2" value="<%= userVO.getPhone2() %>"/></span>&nbsp;&nbsp; - &nbsp;&nbsp;
<span><input type="text" name="phone3" value="<%= userVO.getPhone3() %>"/></span>
<br><br>

<input type='submit' value='ȸ������ ����' />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<input type='reset' value='ȸ������ �������'/>
	
	
	
	
	<p><p><a href='/homework04/homework04/addUser.html'> ȸ������ ����</a>
	<p><p><a href='/homework04/homework04/findUser.html'> ȸ������ ��ȸ</a>
	
	<p><p><a href='homework04/homework04/'> ȸ������ ����</a>
	<p><p><a href='/homework04/homework04/'> Folder �̵�</a>

</body>
</html>