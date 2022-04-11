package json.test;

import org.json.simple.JSONValue;
import org.json.simple.JSONObject;
import org.codehaus.jackson.map.ObjectMapper;

import spring.domain.UserHasASearch;
import spring.domain.Search;

public class UserHasASearchObjectMapperTestApp {

	public static void main(String[] args) throws Exception {
		
		UserHasASearch userHasASearch = new UserHasASearch("user01", "ȫ�浿", "1111", null, 10);
		Search search = new Search();
		search.setSearchCondition("�̸��˻�");
		userHasASearch.setSearch(search);
		
		ObjectMapper objectMapper = new ObjectMapper();
		
		System.out.println("\n");
		System.out.println("1. Domain Object > JSON Value(String) ��ȯ");
		String jsonValue = objectMapper.writeValueAsString(userHasASearch);
		System.out.println(jsonValue);
		
		System.out.println("\n");
		System.out.println("1-1. JSON Value > Domain Object(String) ��ȯ �� �� ����");
		UserHasASearch returnUserHasASearch = objectMapper.readValue(jsonValue, UserHasASearch.class);
		System.out.println(returnUserHasASearch);
		System.out.println("userID : " + returnUserHasASearch.getUserId());
		System.out.println("searchCondition : " + returnUserHasASearch.getSearch().getSearchCondition());
		
		
		System.out.println("\n");
		System.out.println("1-2. JSON Value >  JSONObject ��� �� �� ����");
		JSONObject jsonObj = (JSONObject)JSONValue.parse(jsonValue);
		System.out.println(jsonObj);
		System.out.println("userID : " + jsonObj.get("userId"));
		System.out.println("searchCondition : " + ((JSONObject)(jsonObj.get("search"))).get("searchCondition"));
		
		
	}

}
