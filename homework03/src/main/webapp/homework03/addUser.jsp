<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<%@ page import="homework03.UserVO" %>
<%@ page import="homework03.UserDao" %>
    
    <%
		request.setCharacterEncoding("EUC_KR");
		response.setContentType("text/html;charset=EUC_KR");
		
		// Client���� �Ѿ�� ��
		int regNum = Integer.parseInt(request.getParameter("regNum"));
		String type = request.getParameter("type");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");		
		String name = request.getParameter("name");
		String gender = request.getParameter("gender");
		int phone1 = Integer.parseInt(request.getParameter("phone1"));
		int phone2 = Integer.parseInt(request.getParameter("phone2"));
		int phone3 = Integer.parseInt(request.getParameter("phone3"));

		// Client Data�� UserVo �ν��Ͻ� ���� �� Client Form Data ����
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

		// DB���� Data �˻� ��
		UserDao userDao = new UserDao();
		userDao.getUser(userVO);
	

	%>
		<html>
		<head>
		<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
		</head>
		<body>

	<h2> homework03 Add User ȸ������ </h2>

	<% 	if (userVO.isActive()) {  %>

	<%= userVO.getName() %> �� ȸ�������� �����մϴ�. ��
	
	<%	request.getSession(true).setAttribute("userVO", userVO);%>

	<%	} else {%>
			ȸ������ ���� �߻�
	<%	}%>
		<br><br>
		<p><p><a href='/homework03/homework03/addUser.html'> ȸ������ ȭ������ �̵�</a>
		<p><p><a href='/homework03/homework03/findUser.html'> ȸ����ȸ ȭ������ �̵�</a>
		<p><p><a href='/homework03/homework03/'> Folder �̵�</a>
		<br><br>

		<p><p><a href='/homework03/homework03/findUser.jsp'> ȸ������ ���� (Session ����)</a>
		<br><br>

		</body>
		</html>
	
    
    