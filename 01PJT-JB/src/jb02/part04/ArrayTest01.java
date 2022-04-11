package jb02.part04;

/*
   FileName : ArrayTest01.java
   1. Array(배열) : 같은 Data Type의 묶음
   2. Reference Data Type의 이해
   3. new / . keyword 사용
*/

public class ArrayTest01
{
    //main method
    public static void main (String[] args)
    {

   //1. int Data Type Array 선언 > int[] intArray; or int intArray[];
   //2. 9개의 int를 저장 할수 있는 공간을 갖는 array생성 new int [9];
   //3. 대입 연산자 = 를 이용 대입변수에 9개 공간의 위치정보 대입 i = new int [9];
   //4. array 선언, 생성, 위치정보 대립, 을 동시에
   int[] intArray = new int[9];

   //5. 각 위치에 value 대입
   intArray[0] =1;
   intArray[1] =2;
   intArray[2] =3;
   intArray[3] =4;
   intArray[4] =5;
   intArray[5] =6;
   intArray[6] =7;
   intArray[7] =8;
   intArray[8] =9;

   // Array 선언, 생성, 위치정보, value대입을 동시에
   // int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9}
   // int[] intArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}

   //배열의 index를 이용 각각의 value 접근
   for(int j=0; j<9; j++){
      System.out.println("intArray["+j+"] 값은 : "+intArray[j]);
   }

   //각 각의 값을 이용하여 5단을 출력 intArrayi.length
   // . Operator 와 length keyword 사용
   System.out.println("=====================");
   for (int k=0; k<intArray.length; k++){
     System.out.println("5 X"+intArray[k]+" = " +5*intArray[k]);     
   }

   // 아래의 출력내용을 이해 primitive int i =0
   int[] j = intArray;
   System.out.println("=====================");
   System.out.println("j[0]의 값 : "+j[0]);
   System.out.println("j[5]의 값 : "+j[5]);

   //위 출력을 이해했다면
   j[5] = 1234;
   System.out.println("j[5] ==> "+j[5]);
   System.out.println("i[5] ==> "+ intArray[5]);
   
    }//end of main
  
}//end of class
