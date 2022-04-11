package spring.web.user;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import spring.domain.User;

@RestController
@RequestMapping("/user/*")
public class UserRestController {
	
	///Field
	
	///Constructor
	public UserRestController() {
		System.out.println(":: UserRestController default Constructor call");
	}
	
	/*
	@RequestMapping(value="json/{value}", method=RequestMethod.GET)
	public Map getUser(@PathVariable String value,
						@RequestParam("name") String name,
						@RequestParam("age") int age) throws Exception {
		System.out.println();
		System.out.println("\n== Spring14 map SVR GET start ==========================");
		System.out.println(value);
		System.out.println(name);
		System.out.println(age);
		
		User user = new User();
		user.setUserId("AAA");
		user.setUserName("BBB");
		user.setAge(100);
		System.out.println(user);
		
		Map map = new HashMap();
		map.put("user", user);
		map.put("message", "ok");
			
		System.out.println("== Spring14 map SVR GET end ==========================");
		
		return map;
	}
	*/
	
	@RequestMapping(value="json/{value}", method=RequestMethod.GET)
	public User getUser(	@PathVariable String value,
							@RequestParam("name") String name,
							@RequestParam("age") int age) throws Exception{
		System.out.println();
		System.out.println("\n== Spring14 SVR GET start ==========================");
		
		System.out.println(value);
		System.out.println(name);
		System.out.println(age);
		
		User user = new User();
		user.setUserId("AAA");
		user.setUserName("BBB");
		user.setAge(100);
		System.out.println(user);
		
		System.out.println("== Spring14 SVR GET end ==========================");
		
		return user;
	}
	
	/*
	@RequestMapping(value="json/getUser/{value}", method=RequestMethod.POST)
	public Map getUser(@PathVariable String value,
						@RequestBody User user) throws Exception {
		
		System.out.println();
		System.out.println("\n== Spring14 map SVR POST start ==========================");
		System.out.println("[From Client Data]");
		System.out.println(value);
		System.out.println("1 : " + user);

		System.out.println("[To Client Data]");
		User returnUser = new User();
		returnUser.setUserId("AAA");
		returnUser.setUserName("BBB");
		System.out.println("2 : " + returnUser);
		
		Map map = new HashMap();
		map.put("user", user);
		map.put("message", "ok");
		
		System.out.println("== Spring14 map SVR POST end ==========================");
		
		return map;
	}	
	*/
	
	@RequestMapping(value="json/getUser/{value}", method=RequestMethod.POST)
	public User getUser(	@PathVariable String value,
							@RequestBody User user) throws Exception{
		
		System.out.println("\n== Spring14 SVR POST start ==========================");
		
		System.out.println();
		System.out.println("[From Client Data]");
		System.out.println(value);
		System.out.println("1 : "+user);
		
		System.out.println("[To Client Data");
		User returnUser = new User();
		user.setUserId("AAA");
		user.setUserName("BBB");
		System.out.println("2 : "+returnUser);
		
		System.out.println("== Spring14 SVR POST end ==========================");
		
		return returnUser;
	}
	
}
