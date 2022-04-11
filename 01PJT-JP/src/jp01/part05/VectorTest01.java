package jp01.part05;

import java.util.*;

public class VectorTest01{

	/// Main method
	public static void main(String[] args) {

		//Vector ����: API�� �����ڸ� Ȯ��, ���ڷ� ���޵� 10, 10 �ǹ� Ȯ��.
		Vector vector = new Vector(10,10);

		String s1 = new String("1.ȫ");
		vector.add(s1);
		vector.add(new String("2.��"));
		vector.add("2.�� �ȳ��ϼ���");

		for(int i = 0; i<vector.size(); i++){
			Object obj = vector.elementAt(i);
			String s = (String)obj;
			// String s = (String)vector.elementAt(i);
			System.out.println(s);
			//System.out.print((String)vector.elementAt(i));
		}

		System.out.println("\n ==> 1 API Ȯ��");
		vector.insertElementAt("4.��",1);
		for(int i = 0; i < vector.size(); i++) {
			System.out.println((String)vector.elementAt(i));
		}

		System.out.println("\n ==> 2 API Ȯ��");
		vector.setElementAt("5.,ȫ���",3);
		for(int i = 0; i < vector.size(); i++) {
			System.out.println((String)vector.elementAt(i));
		}

		System.out.println("\n==> 3 API Ȯ��");
		vector.removeElementAt(3);
		for(int i = 0; i < vector.size(); i++) {
			System.out.println((String)vector.elementAt(i));
		}

	}//end of main
}// end of class



