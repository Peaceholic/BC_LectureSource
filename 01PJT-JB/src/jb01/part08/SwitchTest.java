package jb01.part08;

/*
   FileName : SwitchTest.java

   1. 분기문 : switch 연습
*/

public class SwitchTest
{
	//main method
	public static void main (String[] args)
	{

	int inputData = Integer.parseInt(args[0]);
	
	// switch 문은 ()내부의 값과 case 의 상수와 같으면 내부의 실행문을 수행
	// break문을 만날때 까지 진행한다.

	// ==> switch (변수) : 변수는 반드시 정수형일것 (byte, short, int, long, char. 5EA)
	switch(inputData)
	{
	  case 1:	
	     System.out.println("입력하신 값은 1입니다.");
	     break;
	  case 2:	
	     System.out.println("입력하신 값은 2입니다.");
	     break;
	  case 3:	
	     System.out.println("입력하신 값은 3입니다.");
	     break;
	  case 4:	
	     System.out.println("입력하신 값은 4입니다.");
	     break;
	  case 5:	
	     System.out.println("입력하신 값은 5입니다.");
	     break;
	  default:
                 System.out.println("case 문을 다통과 (동일상수 가 없을 경우");
                 System.out.println(" default 가 수행됨.. 입력하신 수는 "+inputData+"입니다.");
  	     break;
	}// end of switch
     
	}//end of main
  
}//end of class

/*
 case 1: 의 break를 주석처리 하고 실행해 보면...
 어떤 결과가 나오는지 확인하자. ==> break의 역활확인
*/