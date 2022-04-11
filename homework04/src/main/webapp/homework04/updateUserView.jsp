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
* 등록번호 : &nbsp;&nbsp;&nbsp;
<input type="text" name="regNum" value="<%= userVO.getRegNum() %>"/>
<br><br>

[ Varchar2 ] &nbsp; (type) &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
* 구분 : &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<select name=type >
<option>사용자</option>
<option>관리자</option>
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
* 이름 : &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<input type="text" name="name" value="<%= userVO.getName() %>"/>
<br><br>
        
[ Varchar2 ] &nbsp; (gender) &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
* 성별 : &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
남자 <input type="radio" name="gender" checked />
여자 <input type="radio" name="gender" />
<br><br>


[ Number ] &nbsp;&nbsp;&nbsp; (phone 1, 2, 3) &nbsp;&nbsp;
* 연락처 : &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<span><input type="text" name="phone1" value="<%= userVO.getPhone1() %>"/></span>&nbsp;&nbsp; - &nbsp;&nbsp;
<span><input type="text" name="phone2" value="<%= userVO.getPhone2() %>"/></span>&nbsp;&nbsp; - &nbsp;&nbsp;
<span><input type="text" name="phone3" value="<%= userVO.getPhone3() %>"/></span>
<br><br>

<input type='submit' value='회원정보 수정' />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<input type='reset' value='회원정보 수정취소'/>
	
	
	
	
	<p><p><a href='/homework04/homework04/addUser.html'> 회원정보 가입</a>
	<p><p><a href='/homework04/homework04/findUser.html'> 회원정보 조회</a>
	
	<p><p><a href='homework04/homework04/'> 회원정보 수정</a>
	<p><p><a href='/homework04/homework04/'> Folder 이동</a>

</body>
</html>