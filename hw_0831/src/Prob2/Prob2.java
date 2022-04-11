package Prob2;

public class Prob2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String url1 = "http://localhost/order?prodId=PROD-001&prodName=갤럭시3&price=980000";

		String prodName = getParameter(url1, "prodName");
		System.out.println("제품이름 : " + prodName);

		String url2 = "http://localhost/order?userId=USER-001&UserName=홍길동&address=서울시 강남구&userAge=26";

		String userAddress = getParameter(url2, "address");
		System.out.println("제품이름 : " + userAddress);

	}

	private static String getParameter(String url, String parameter) {

		// 구현
		int target = url.indexOf(parameter);
		int start = target + parameter.length() + 1;
		int end = url.substring(target).indexOf("&") + target;

		String result = url.substring(start, end);

		return result;
	}

}
