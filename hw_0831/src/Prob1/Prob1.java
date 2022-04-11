package Prob1;

import java.util.regex.*;

public class Prob1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * ÈùÆ® 16Áø¼ö º¯È¯ String value = "È«"; byte[] temp = value.getBytes();
		 * System.out.println(Integer.toHexString(temp[0]));
		 * System.out.println(Integer.toHexString(temp[1]));
		 * 
		 * value = "A"; temp = value.getBytes();
		 * System.out.println(Integer.toHexString(temp[0]));
		 */

		Prob1 p1 = new Prob1();

		System.out.println("ÀÔ·Â : Korea");
		System.out.println("Ãâ·Â : " + p1.toEncoding("Korea"));

		System.out.println("ÀÔ·Â : È«±æµ¿");
		System.out.println("Ãâ·Â : " + p1.toEncoding("È«±æµ¿"));

		System.out.println("ÀÔ·Â : È« ±æ µ¿");
		System.out.println("Ãâ·Â : " + p1.toEncoding("È« ±æ µ¿"));

		System.out.println("ÀÔ·Â : Hong ±æ µ¿");
		System.out.println("Ãâ·Â : " + p1.toEncoding("Hong ±æ µ¿"));

		System.out.println("ÀÔ·Â : 0319");
		System.out.println("Ãâ·Â : " + p1.toEncoding("0319"));

		System.out.println("Ãâ·Â : " + p1.toEncoding("È«"));

	}

	public String toEncoding(String str) {

		StringBuilder sb = new StringBuilder();

		char[] charArray = str.toCharArray();

		for (char c : charArray) {

			boolean num = Pattern.matches("^[0-9]*$", Character.toString(c));
			boolean eng = Pattern.matches("^[a-zA-Z]*$", Character.toString(c));
			boolean kor = Pattern.matches("^[¤¡-¤¾°¡-ÆR]*$", Character.toString(c));

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
