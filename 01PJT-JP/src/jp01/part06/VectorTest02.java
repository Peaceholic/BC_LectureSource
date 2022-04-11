package jp01.part06;

import java.util.*;

public class VectorTest02 extends Vector {

	///Field

	///Constructor
	public VectorTest02() {
		super();
	}
	public VectorTest02(int initialCapacity, int capacityIncrement) {
		super(initialCapacity, capacityIncrement);
	}

	///method
	public void pringString(Vector vector) {

		System.out.println("111 =*=*=*=*=*=*=");		
		for(int i = 0; i < vector.size(); i++) {			
			System.out.print((String)vector.elementAt(i));
		}
		System.out.println("\n");
		
		// 위(20~21)와 비교
		System.out.println("222 =*=*=*=*=*=*=");
		for(Object object: vector) {			
			System.out.print((String)object);
		}
		System.out.println("\n");
	}

	///Main Method
	public static void main(String[] args) {

		VectorTest02 vectorTest = new VectorTest02(10,10);

		String s1 = new String("1.홍");
		vectorTest.add(s1);
		vectorTest.add(new String("2.동"));
		vectorTest.add("2.님 안녕하세요");

		vectorTest.pringString(vectorTest);

		System.out.println("\n ==> 1 API 확인");
		vectorTest.insertElementAt("4.길",1);
		vectorTest.pringString(vectorTest);

		System.out.println("\n ==> 2 API 확인");
		vectorTest.setElementAt("5.,홍길순",3);
		vectorTest.pringString(vectorTest);

		System.out.println("\n==> 3 API 확인");
		vectorTest.removeElementAt(3);
		vectorTest.pringString(vectorTest);

	}//end of main
}// end of class

