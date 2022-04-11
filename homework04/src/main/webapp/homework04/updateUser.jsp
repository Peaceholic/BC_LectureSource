<%@ page contentType="text/html; charset=EUC-KR"%>
<%@ page import="homework04.UserVO" %>
<%@ page import="homework04.UserDao" %>

<%
	
	request.setCharacterEncoding("euc_kr");
	UserVO userVO = new UserVO();
	
	int regNum = Integer.parseInt(request.getParameter("regNum"));
	String type = request.getParameter("type");
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");		
	String name = request.getParameter("name");
	String gender = request.getParameter("gender");
	int phone1 = Integer.parseInt(request.getParameter("phone1"));
	int phone2 = Integer.parseInt(request.getParameter("phone2"));
	int phone3 = Integer.parseInt(request.getParameter("phone3"));

	// Client Data로 UserVo 인스턴스 생성 및 Client Form Data 전달
	userVO = new UserVO();
	userVO.setRegNum(regNum);
	userVO.setType(type);
	userVO.setId(id);
	userVO.setPw(pw);
	userVO.setName(name);
	userVO.setGender(gender);
	userVO.setPhone1(phone1);
	userVO.setPhone2(phone2);
	userVO.setPhone3(phone3);
	
	new UserDao().updateUser(userVO);  
	System.out.println("회원정보 업데이트 완료");
		
	session.setAttribute("userVO", userVO);

%>

    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>회원가입 완료</title>
</head>
<body>
<%= userVO.getName() %>"회원정보 업데이트 완료"
<a href= /homework04/findUser/FindUser.jsp>내정보보기</a>
</body>
</html>