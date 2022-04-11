<%@ page contentType="text/html;charset=euc-kr" %>



<br/><hr/>

	<h3>
	 ㅇ 05JSPActionInclude.jsp 시작<br/><br/>
	 
	 	request,session,application  Object Scope  Data 추출 <br/><br/>
	
		request ObjectScope 추출 Data : <%= request.getAttribute("aaa") %><br/>
		session ObjectScope 추출 Data : <%= session.getAttribute("bbb") %><br/>
		application ObjectScope 추출 Data : <%= application.getAttribute("ccc") %><br/><br/>
	
	 ㅇ 05JSPActionInclude.jsp 끝 <br/> 
	</h3>
	
	param으로 전달 받은 값 <%= request.getParameter("value") %> <br><br>

<hr/><br/>
	