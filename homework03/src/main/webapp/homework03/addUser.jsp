<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<%@ page import="homework03.UserVO" %>
<%@ page import="homework03.UserDao" %>
    
    <%
		request.setCharacterEncoding("EUC_KR");
		response.setContentType("text/html;charset=EUC_KR");
		
		// Client에서 넘어온 값
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
		UserVO userVO = new UserVO();
		userVO.setRegNum(regNum);
		userVO.setType(type);
		userVO.setId(id);
		userVO.setPw(pw);
		userVO.setName(name);
		userVO.setGender(gender);
		userVO.setPhone1(phone1);
		userVO.setPhone2(phone2);
		userVO.setPhone3(phone3);

		// DB접근 Data 검색 비교
		UserDao userDao = new UserDao();
		userDao.getUser(userVO);
	

	%>
		<html>
		<head>
		<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
		</head>
		<body>

	<h2> homework03 Add User 회원가입 </h2>

	<% 	if (userVO.isActive()) {  %>

	<%= userVO.getName() %> 님 회원가입을 축하합니다. ♡
	
	<%	request.getSession(true).setAttribute("userVO", userVO);%>

	<%	} else {%>
			회원가입 오류 발생
	<%	}%>
		<br><br>
		<p><p><a href='/homework03/homework03/addUser.html'> 회원가입 화면으로 이동</a>
		<p><p><a href='/homework03/homework03/findUser.html'> 회원조회 화면으로 이동</a>
		<p><p><a href='/homework03/homework03/'> Folder 이동</a>
		<br><br>

		<p><p><a href='/homework03/homework03/findUser.jsp'> 회원정보 보기 (Session 유지)</a>
		<br><br>

		</body>
		</html>
	
    
    