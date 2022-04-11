package spring.web.user;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import spring.domain.User;
import spring.service.user.UserService;

@Controller
public class UserController {
	
	@Autowired
	@Qualifier("userService")
	private UserService userService;
	
	public UserController() {
		System.out.println(":: User004Controller default Constructor call");
	}
	
	////////////변경
	
	@RequestMapping("/logon.do")
	public ModelAndView logon(HttpSession session) {
		
		System.out.println("[logon() start....................]");
		
		String message = "[logon () ] 아이디, 패스워드 3자 이상 입력하라!";
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/user/logon.jsp");
		modelAndView.addObject("message", message);
		
		System.out.println("[logon() end....................]");
		return modelAndView;
	}
	
	@RequestMapping("/home.do")
	public ModelAndView home(HttpSession session) {
		System.out.println("[home() start....................]");
		
		String message = "[home () ] WELCOME";
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/user/home.jsp");
		modelAndView.addObject("message", message);
		
		System.out.println("[home() end....................]");
		return modelAndView;
	}
	////////////////////////////http protocol GET/POST 구분 대응 추가/ 변경된 부분
	
	@RequestMapping(value="/logonAction.do", method=RequestMethod.GET)
	public ModelAndView logonAction() {
		System.out.println("[logonAction() method=RequestMethod.GET start....................]");
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/logon.do");
		
		System.out.println("[LogonAction() method=RequestMethod.GET end....................]");

		return modelAndView;
	}
	
	@RequestMapping(value="/logonAction.do", method=RequestMethod.POST)
	public ModelAndView logonAction(@ModelAttribute("user") User user, HttpSession session) throws Exception {
		System.out.println("[logonAction() method=RequestMethod.POST start....................]");
		
		//get/post에 따른 대응으로 아래의 권한 인증작업 불필요
		//if(session.isNew() ||session.getAttribute("sessionUser")==null) {
			//session.setAttribute("sessionUser", new User());
		//}
		//User sessionUser = (User)session.getAttribute("sessionUser");
		
		String viewName = "/user/logon.jsp";
		
		//if(sessionUser.isActive()) {
			//viewName = "/user002/home.jsp";
		//}
		//else {
		//	UserDao userDAO = new UserDao();
		//	userDAO.getUser(user);
		
		User returnUser = userService.getUser(user.getUserId());
		if(returnUser.getPassword().equals(user.getPassword())) {
			returnUser.setActive(true);
			user = returnUser;			
		}
		
			
			if(user.isActive()) {
				viewName = "/user/home.jsp";
				session.setAttribute("sessionUser", user);
			}
		//}
		System.out.println("[ action : " +viewName+ "]");
		
		String message = null;
		if(viewName.equals("/user/home.jsp")) {
			message = "[logon () ] WELCOME";
		}else {
			message = "[logon () ] 아이디, 패스워드 3자 이상 입력하라!";
		}
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName(viewName);
		modelAndView.addObject("message", message);
		
		System.out.println("[LogonAction() method=RequestMethod.POST end....................]");

		return modelAndView;
	}
	////////////////////////////////////////////////
	
	@RequestMapping("/logout.do")
	public ModelAndView logout(HttpSession session) {
		System.out.println("[logout() start....................]");
		
		session.removeAttribute("sessionUser");
		
		String message = "[Logout()] 아이디, 패스워드 3자 이상 입력하세요.";
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/user/logon.jsp");
		modelAndView.addObject("message",message);
		
		System.out.println("[Logout() end....................]");
		
		return modelAndView;
	}
	
}
