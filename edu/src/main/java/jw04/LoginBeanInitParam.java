package jw04;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginBeanInitParam extends HttpServlet {
	
	//Field
	private String jdbcDriver;
	private String jdbcURL;
	private String jdbcUser;
	private String jdbcPasswd;

	public void init(ServletConfig sc) throws ServletException {
		super.init(sc);
		jdbcDriver = sc.getInitParameter("jdbcDriver");
		jdbcURL = sc.getInitParameter("jdbcURL");
		jdbcUser = sc.getInitParameter("jdbcUser");
		jdbcPasswd = sc.getInitParameter("jdbcPasswd");
		
		System.out.println("web.xml ��ϵ� �� �������� Ȯ��");
		System.out.println("jdbcDriver : "+jdbcDriver);
		System.out.println("jdbcURL : "+jdbcURL);
		System.out.println("jdbcUser : "+jdbcUser);
		System.out.println("jdbcPassword : "+jdbcPasswd);
	}
	
	public void doPost(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException{
			
			req.setCharacterEncoding("EUC_KR");
			res.setContentType("text/html;charset=EUC_KR");
			PrintWriter out = res.getWriter();
			
			String id = req.getParameter("id");
			String pwd = req.getParameter("pwd");
			
			UserVO userVO = new UserVO();
			userVO.setId(id);
			userVO.setPwd(pwd);
			
			UserInitParamDao dao = new UserInitParamDao();
			dao.setJdbcDriver(jdbcDriver);
			dao.setJdbcURL(jdbcURL);
			dao.setJdbcUser(jdbcUser);
			dao.setJdbcPassword(jdbcPasswd);
			
			dao.getUser(userVO);
			
			out.print("<html>");
			out.print("<head></head>");
			out.print("<body>");
	
			out.print("<h2>Login ȭ��</h2>");
			
			if(userVO.isActive()) {
				out.println(id+"�� ȯ���մϴ�.");
				destroy(req, res);
			}else {
				out.println("login ���� id,pwd�� Ȯ���ϼ���.");
			}
			
			out.println("<p><p><a href='/edu/jw04/loginBeanInitParam.html'>�ڷ�</a>");
			out.println("</boyd>");
			out.println("</html>");
		}
	
	public void destroy(HttpServletRequest req, HttpServletResponse res) {
		super.destroy();
		req = null;
		res = null;
		System.out.println("�ڿ�����");
	}
}
