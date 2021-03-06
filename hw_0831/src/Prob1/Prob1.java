package Prob1;

import java.util.regex.*;

public class Prob1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 힌트 16진수 변환 String value = "홍"; byte[] temp = value.getBytes();
		 * System.out.println(Integer.toHexString(temp[0]));
		 * System.out.println(Integer.toHexString(temp[1]));
		 * 
		 * value = "A"; temp = value.getBytes();
		 * System.out.println(Integer.toHexString(temp[0]));
		 */

		Prob1 p1 = new Prob1();

		System.out.println("입력 : Korea");
		System.out.println("출력 : " + p1.toEncoding("Korea"));

		System.out.println("입력 : 홍길동");
		System.out.println("출력 : " + p1.toEncoding("홍길동"));

		System.out.println("입력 : 홍 길 동");
		System.out.println("출력 : " + p1.toEncoding("홍 길 동"));

		System.out.println("입력 : Hong 길 동");
		System.out.println("출력 : " + p1.toEncoding("Hong 길 동"));

		System.out.println("입력 : 0319");
		System.out.println("출력 : " + p1.toEncoding("0319"));

		System.out.println("출력 : " + p1.toEncoding("홍"));

	}

	public String toEncoding(String str) {

		StringBuilder sb = new StringBuilder();

		char[] charArray = str.toCharArray();

		for (char c : charArray) {

			boolean num = Pattern.matches("^[0-9]*$", Character.toString(c));
			boolean eng = Pattern.matches("^[a-zA-Z]*$", Character.toString(c));
			boolean kor = Pattern.matches("^[ㄱ-ㅎ가-힣]*$", Character.toString(c));

			if (c == ' ') {
				sb.append(" ");
			}

			if (num == true) {
				sb.append(c);
			}

			if (eng == true) {
				sb.append(c);
			}

			if (kor == true) {

				String tempStr = c + "";
				byte[] tempArr = tempStr.getBytes();
				for (int i = 0; i < tempArr.length; i++) {
					sb.append("%" + Integer.toHexString(tempArr[i]).toUpperCase().substring(6, 8));
				}

			}

		}

		return sb.toString();
	}
}// end of class
