package jb02.part03;

/*
   FileName : ContinueTest.java

   // keyword : continue; > continue 이후 실행문을 중단, 단시 반복문 실행

   // continue문을 이용하여 짝수만 더하기
   // java ContinueTest 5 > 1~5중 짝수값 2, 4를 더한 6값을 출력
*/

public class ContinueTest {
	// main method
	public static void main (String[] args)
    {

     //입력받은 data를 int변환
     int inputData = Integer.parseInt(args[0]);

     //더한값 저장하는 변수 선언
     int sum=0;

     for(int i=0; i<=inputData; i++){
         if(i%2==1) { //홀수이면
             continue;
         }
         sum = sum + i;

         // 아래의 내용은 for순환문의 Debug 를 위한 출력문
         System.out.println("i : " +i);
         System.out.println("sum : " +sum);
     }
         System.out.println("0 ~ "+inputData+" 까지의 짝수의 합은 : "+sum); 
  }// end of main

}// end of class