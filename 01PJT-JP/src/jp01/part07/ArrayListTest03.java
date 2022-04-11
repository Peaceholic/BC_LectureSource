package jp01.part07;

/*
		FileName : ArrayListTest03.java

		1. Vector, ArrayList의 Hierarchy를 보면 두 클래스는 동일한 공유구조를 갖는다.
			추후 학습한 Thread의 동기화 부분에서 다른 동작을 한다. ( → 추후 학습)
		2. Generic ( jdk1.5 추가 기능)
			ArrayList 생성 시 관리 할 DataType을 미리 선언 가능
			Data 추출 시 관리 할  DataType이 결정되어 있으니 명시적 형변환 불필요
*/
import java.util.*;

public class ArrayListTest03{
	
	/// Main Method
	public static void main(String[] args){
		
		// ArrayList 생성 시 관리(저장, 추출) 될 객체의 DataType 선언
		ArrayList<String> arrayList = new ArrayList<String>(10);

		// add(E obj) : E를 인자로 받는다는 의미는? :: Generic 사용으로 묵시적 형변환 불필요
		String s1 = new String("1.홍");
		arrayList.add(s1);
		arrayList.add(new String("길"));
		arrayList.add("3.님 안녕하세요");

		// ArrayList 저장된 값을 출력
		for ( int i = 0 ; i < arrayList.size() ; i++ )	{
			// Generic 사용으로 명시적 형변환 불필요
			System.out.print( arrayList.get(i) );
		}

		System.out.println("\nJDK 1.5 추가기능 :: Generic , Enhanced For Loop 사용");
		// → 위의 for문과 비교하여 이해하자. / JDK 1.5에 추가기능 :: Enhanced For Loop
		// ArrayList 내부에 저장된 값을 size()만큼 반복, 1EA 씩 추출 Strting 준다. (Generic 사용으로)
		for ( String value : arrayList )	{
			System.out.print( value );
		}

		System.out.print( "\n → AL1 API 확인 " );
		arrayList.add(1,"4.길");
		for ( int i = 0 ; i < arrayList.size()  ; i++ ){
			System.out.print( arrayList.get(i) );
		}

		System.out.print( "\n → AL2 API 확인 " );
		arrayList.set(3,",4.홍길순");
		for ( int i = 0 ; i < arrayList.size()  ; i++ ){
			System.out.print( arrayList.get(i) );
		}

		System.out.print( "\n → AL3 API 확인 " );
		arrayList.remove(3);
		for ( int i = 0 ; i < arrayList.size()  ; i++ ){
			System.out.print( arrayList.get(i) );
		}

	} // end of main

} // end of class