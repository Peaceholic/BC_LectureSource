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

	// Client Data�� UserVo �ν��Ͻ� ���� �� Client Form Data ����
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
	System.out.println("ȸ������ ������Ʈ �Ϸ�");
		
	session.setAttribute("userVO", userVO);

%>

    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>ȸ������ �Ϸ�</title>
</head>
<body>
<%= userVO.getName() %>"ȸ������ ������Ʈ �Ϸ�"
<a href= /homework04/findUser/FindUser.jsp>����������</a>
</body>
</html>