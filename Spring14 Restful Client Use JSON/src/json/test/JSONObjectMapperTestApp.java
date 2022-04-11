package json.test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONValue;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import spring.domain.User;

public class JSONObjectMapperTestApp {

	public static void main(String[] args) throws Exception {
		
		User user = new User("user01", "홍길동", "1111", null, 10);
		
		ObjectMapper objectMapper = new ObjectMapper();
		
		System.out.println("\n");
		System.out.println("1. Domain Object > JSON Value(String) 변환");
		String jsonOneValue = objectMapper.writeValueAsString(user);
		System.out.println(jsonOneValue);
		
		System.out.println("\n");
		System.out.println("1-1. JSON Value > Domain Object(String) 변환 및 값 추출");
		User returnUser = objectMapper.readValue(jsonOneValue, User.class);
		System.out.println(returnUser);
		System.out.println("userID : " + returnUser.getUserId());
		
		System.out.println("\n");
		System.out.println("1-2. JSON Value >  JSONObject 사용 및 값 추출");
		JSONObject jsonObj = (JSONObject)JSONValue.parse(jsonOneValue);
		System.out.println(jsonObj);
		System.out.println("userID : " + jsonObj.get("userId"));		
		
		
		System.out.println("\n\n ==================================================== \n");
		List<User> list = new ArrayList<User>(10);
		list.add(user);
		list.add(new User("user02", "홍길동", "2222", null, 20));
				
		System.out.println("\n");
		System.out.println("2. List<User> > JSON Value(String) 변환");
		String jsonManyValue = objectMapper.writeValueAsString(list);
		System.out.println(jsonManyValue);
		
		System.out.println("\n");
		System.out.println("2-1. JSON Value(String) >  List<User> 변환 및 값 추출");
		List<User> returnList = objectMapper.readValue(jsonManyValue, new TypeReference<List<User>>() {});
		System.out.println(returnList);
		System.out.println(returnList.get(0).getUserId());
		
		System.out.println("\n");
		System.out.println("2-2. JSON Value >  JSONObject 사용 및 값 추출");
		JSONArray jsonArray = (JSONArray)JSONValue.parse(jsonManyValue);
		System.out.println(jsonArray);
		System.out.println((JSONObject)jsonArray.get(0));
		System.out.println("userID : " + ( (JSONObject)jsonArray.get(0)).get("userId") );
				
		
		System.out.println("\n\n ==================================================== \n");
		Map<String, User> map = new HashMap<String, User>();
		map.put("1", user);
		map.put("2", new User("user02", "홍길동", "2222", null, 20));
						
		System.out.println("\n");
		System.out.println("3. Map<User> > JSON Value(String) 변환");
		jsonManyValue = objectMapper.writeValueAsString(map);
		System.out.println(jsonManyValue);
		
		System.out.println("\n");
		System.out.println("3-1. JSON Value(String) >  Map<User> 변환 및 값 추출");
		Map<String, User> returnMap = objectMapper.readValue(jsonManyValue, new TypeReference<Map<String, User>>() {});
		System.out.println(returnMap);
		System.out.println(returnMap.get("1"));
		System.out.println(returnMap.get("1").getUserId());
		
		System.out.println("\n");
		System.out.println("3-2. JSON Value >  JSONObject 사용 및 값 추출");
		jsonObj = (JSONObject)JSONValue.parse(jsonManyValue);
		System.out.println(jsonObj);
		System.out.println((JSONObject)jsonObj.get("1"));
		System.out.println("userID : " + ( (JSONObject)jsonObj.get("1")).get("userId") );
				
	}

}
