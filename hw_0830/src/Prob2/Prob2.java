package Prob2;

import java.util.StringTokenizer;

public class Prob2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "PROD-001#X-note#Samsung#3#6000000";
		String[] strs = stringSplit(str, "#");
		System.out.println("=====문자열 처리결과=====");
		for (int i = 0; i < strs.length; i++) {
			System.out.println(strs[i]);
		}
	}

	/*
	// == 1 == String.split() 사용
	private static String[] stringSplit(String str1, String str2) {
		String[] tempArr = str1.split(str2);
		return tempArr;
	}

	// == 2 == StringTokenizer 사용
	private static String[] stringSplit(String str1, String str2) {

		int count = 0;
		for (int i = 0; i < str1.length(); i++) {
			if (Character.toString(str1.charAt(i)).equals(str2.toString())) {
				count++;
			}
		}

		String[] tempArr = new String[count + 1];

		StringTokenizer st = new StringTokenizer(str1, str2);

		int arrIndex = 0;
		while (st.hasMoreTokens()) {
			tempArr[arrIndex] = st.nextToken();
			arrIndex++;
		}
		return tempArr;
	}
    */
	// 일반	
	private static String[] stringSplit(String str1, String str2) {

		int count = 0;
		for (int i = 0; i < str1.length(); i++) {
			if (Character.toString(str1.charAt(i)).equals(str2.toString())) {
				count++;
			}
		}

		String[] tempArr = new String[count + 1];
		String tempStr = "";
		int arrIndex = 0;
		for (int i = 0; i < str1.length(); i++) {
			if (Character.toString(str1.charAt(i)).equals(str2.toString())) {
				tempArr[arrIndex] = tempStr;
				arrIndex++;
				tempStr = "";
			} else {
				tempStr += str1.charAt(i);
				if (arrIndex == tempArr.length - 1) {
					tempArr[arrIndex] = tempStr;
				}
			}
		}
		return tempArr;
	}
	
}// end of class
