package jp01.part05;

import java.util.*;

public class VectorTest01{

	/// Main method
	public static void main(String[] args) {

		//Vector 생성: API의 생성자를 확인, 인자로 전달된 10, 10 의미 확인.
		Vector vector = new Vector(10,10);

		String s1 = new String("1.홍");
		vector.add(s1);
		vector.add(new String("2.동"));
		vector.add("2.님 안녕하세요");

		for(int i = 0; i<vector.size(); i++){
			Object obj = vector.elementAt(i);
			String s = (String)obj;
			// String s = (String)vector.elementAt(i);
			System.out.println(s);
			//System.out.print((String)vector.elementAt(i));
		}

		System.out.println("\n ==> 1 API 확인");
		vector.insertElementAt("4.길",1);
		for(int i = 0; i < vector.size(); i++) {
			System.out.println((String)vector.elementAt(i));
		}

		System.out.println("\n ==> 2 API 확인");
		vector.setElementAt("5.,홍길순",3);
		for(int i = 0; i < vector.size(); i++) {
			System.out.println((String)vector.elementAt(i));
		}

		System.out.println("\n==> 3 API 확인");
		vector.removeElementAt(3);
		for(int i = 0; i < vector.size(); i++) {
			System.out.println((String)vector.elementAt(i));
		}

	}//end of main
}// end of class



