package client.app;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.codehaus.jackson.annotate.JsonValue;
import org.codehaus.jackson.map.ObjectMapper;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

import spring.domain.User;


public class RestHttpClientApp {

	public static void main(String[] args) throws Exception {
		////주석 하나씩 처리하며 연습
		
		//System.out.println("\n==================================\n");
		//1.1 Http Get 방식 Request: JsonSimple lib 사용
		System.out.println("\n\n== 1 ====================");
		RestHttpClientApp.RequestHttpGet_UseJsonSimple();
		
		//System.out.println("\n==================================\n");
		//1.2 Http Get 방식 Request: CodeHaus lib 사용
		System.out.println("\n\n== 2 ====================");
		RestHttpClientApp.RequestHttpGet_UseCodeHaus();
		
		//System.out.println("\n==================================\n");
		//2.1 Http Protocol POST 방식 Request
		// : Form Data 전달(JSON 이용)/JsonSimple lib 사용
		System.out.println("\n\n== 3 ====================");
		RestHttpClientApp.RequestHttpPostData_UseJsonSimple();
		
		//System.out.println("\n==================================\n");
		//2.2 Http Protocol POST 방식 Request
		// : Form Data 전달(JSON 이용)/CodeHaus lib 사용
		System.out.println("\n\n== 4 ====================");
		RestHttpClientApp.RequestHttpPostData_UseCodeHaus();
		
		
	}
	
	public static void RequestHttpGet_UseJsonSimple() throws Exception {
		HttpClient httpClient = new DefaultHttpClient();
		
		String url = "http://127.0.0.1:8080/Spring14/user/json/user01?name=user02&age=10";
		
		HttpGet httpGet = new HttpGet(url);
		httpGet.setHeader("Accept", "application/json");
		httpGet.setHeader("content-Type","application/json");
		
		HttpResponse httpResponse = httpClient.execute(httpGet);
		
		System.out.println("httpResponse : " + httpResponse);
		System.out.println();
		
		HttpEntity responsHttpEntity=httpResponse.getEntity();
		
		InputStream is = responsHttpEntity.getContent();
		BufferedReader br = new BufferedReader(new InputStreamReader(is,"UTF-8"));
		
		System.out.println("[Server에서 받은 Data 확인 ]");
		String serverData = br.readLine();
		System.out.println("serverData : "+serverData);
		
		JSONObject jsonobj = (JSONObject)JSONValue.parse(serverData);
		
		System.out.println("jsonobj : " +jsonobj);
		
	}
	
	public static void RequestHttpGet_UseCodeHaus() throws Exception {
		HttpClient httpClient = new DefaultHttpClient();
		
		String url= "http://127.0.0.1:8080/Spring14/user/json/user01?name=user02&age=10";
		
		HttpGet httpGet=new HttpGet(url);
		httpGet.setHeader("Accept","application/json");
		httpGet.setHeader("Content-Type","applicatoin/json");
		
		HttpResponse httpResponse = httpClient.execute(httpGet);
		
		System.out.println("httpResponse : " + httpResponse);
		System.out.println();
		
		HttpEntity responseHttpEntity = httpResponse.getEntity();
		
		InputStream is = responseHttpEntity.getContent();
		BufferedReader br = new BufferedReader(new InputStreamReader(is,"UTF-8"));
		
		System.out.println("[Server 에서 받은 DATA 확인]");
		String serverData = br.readLine();
		System.out.println("serverData : "+serverData);
		
		JSONObject jsonobj = (JSONObject)JSONValue.parse(serverData);
		ObjectMapper objectMapper = new ObjectMapper();
		
		// Spring 14 Server에서 Map으로 return
		//User user = objectMapper.readValue(jsonobj.get("user").toString(), User.class);
		
		// Spring 14 Server에서 Obj으로 return
		User user = objectMapper.readValue(jsonobj.toString(), User.class);
		
		System.out.println("user : " + user);
		
	}
	
	public static void RequestHttpPostData_UseJsonSimple() throws Exception{
			
		HttpClient httpClient = new DefaultHttpClient();
		
		String url = "http://127.0.0.1:8080/Spring14/user/json/getUser/user01";
		
		
		HttpPost httpPost = new HttpPost(url);
		
		httpPost.setHeader("Accept","application/json");
		httpPost.setHeader("Content-Type","application/json");
		
		//String data = "{\"userId\":\"test\",\"userName\":\"홍길동\"}";
		
		JSONObject json = new JSONObject();
		json.put("userId", "test");
		json.put("userName","홍길동");
		
		HttpEntity requestHttpEntity = new StringEntity(json.toString(),"utf-8");
		httpPost.setEntity(requestHttpEntity);
		
		HttpResponse httpResponse = httpClient.execute(httpPost);
		
		System.out.println("httpResponse : " + httpResponse);
		System.out.println();
		
		HttpEntity responseHttpEntity = httpResponse.getEntity();
		
		InputStream is = responseHttpEntity.getContent();
		BufferedReader br = new BufferedReader(new InputStreamReader(is,"UTF-8"));
		
		System.out.println("[Server에서 받은 데이터 확인");
		String serverData = br.readLine();
		System.out.println("serverData : "+serverData);
		
		JSONObject jsonobj = (JSONObject)JSONValue.parse(serverData);
		
		System.out.println("jsonobj : "+jsonobj);			
	}
	
	public static void RequestHttpPostData_UseCodeHaus() throws Exception {
		
		HttpClient httpClient = new DefaultHttpClient();
		
		String url = "http://127.0.0.1:8080/Spring14/user/json/getUser/user01";
		
		
		HttpPost httpPost = new HttpPost(url);
		
		httpPost.setHeader("Accept","application/json");
		httpPost.setHeader("Content-Type","application/json");
		
		//String data = "{\"userId\":\"test\",\"userName\":\"홍길동\"}";
		
		JSONObject json = new JSONObject();
		json.put("userId", "test");
		json.put("userName","홍길동");
		
		User user = new User("test","홍길동", "1111", null, 10);
		ObjectMapper objectMapper01 = new ObjectMapper();
		
		String jsonValue = objectMapper01.writeValueAsString(user);
		
		
		HttpEntity requestHttpEntity = new StringEntity(json.toString(),"utf-8");
		httpPost.setEntity(requestHttpEntity);
		
		HttpResponse httpResponse = httpClient.execute(httpPost);
		
		System.out.println("httpResponse : " + httpResponse);
		System.out.println();
		
		HttpEntity responseHttpEntity = httpResponse.getEntity();
		
		InputStream is = responseHttpEntity.getContent();
		BufferedReader br = new BufferedReader(new InputStreamReader(is,"UTF-8"));
		
		System.out.println("[Server에서 받은 데이터 확인");
		String serverData = br.readLine();
		System.out.println("serverData : "+serverData);
		
		JSONObject jsonobj = (JSONObject)JSONValue.parse(serverData);
		
		ObjectMapper objectMapper = new ObjectMapper();
		
		// Spring 14 Server에서 Map으로 return
		//User returnUser = objectMapper.readValue(jsonobj.get("user").toString(), User.class);
		
		// Spring 14 Server에서 Obj으로 return
		User returnUser = objectMapper.readValue(jsonobj.toString(), User.class);
		
		System.out.println("returnUser : " + returnUser);
				
	}

}
