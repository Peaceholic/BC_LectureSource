package jp01.part09;

/*
 java.util.Stack (Last in First Out)
 의 API를 확인하고 각각의 Method 의미를 확인
 아래의 출력결과를 확인
*/

import java.util.Stack;

public class StackTest
{
	public static void main(String[] args) 
	{
		Stack<String> stack = new Stack<String>();

		String value = new String("1 : 홍길동");
		stack.push(value);
		stack.push(new String("2 : 이순신"));
		stack.push("3 : 주몽");

		System.out.println("==> 저장된 Data 개수 : "+stack.size());
		String str1 = stack.pop();
		System.out.println(str1);

		System.out.println("==> 저장된 Data 개수 : "+stack.size());
		String str2 = stack.peek();   //pop 와 peek의 차이점은
		System.out.println(str2);

		System.out.println("==> 저장된 Data 개수 : "+stack.size());
		while(! stack.isEmpty()){
			String str3 = (String)stack.pop();
			System.out.println(str3);
		}
	}
}
