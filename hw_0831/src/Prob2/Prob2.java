package Prob2;

public class Prob2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String url1 = "http://localhost/order?prodId=PROD-001&prodName=������3&price=980000";

		String prodName = getParameter(url1, "prodName");
		System.out.println("��ǰ�̸� : " + prodName);

		String url2 = "http://localhost/order?userId=USER-001&UserName=ȫ�浿&address=����� ������&userAge=26";

		String userAddress = getParameter(url2, "address");
		System.out.println("��ǰ�̸� : " + userAddress);

	}

	private static String getParameter(String url, String parameter) {

		// ����
		int target = url.indexOf(parameter);
		int start = target + parameter.length() + 1;
		int end = url.substring(target).indexOf("&") + target;

		String result = url.substring(start, end);

		return result;
	}

}
