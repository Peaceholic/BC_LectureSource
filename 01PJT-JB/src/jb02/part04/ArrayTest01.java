package jb02.part04;

/*
   FileName : ArrayTest01.java
   1. Array(�迭) : ���� Data Type�� ����
   2. Reference Data Type�� ����
   3. new / . keyword ���
*/

public class ArrayTest01
{
    //main method
    public static void main (String[] args)
    {

   //1. int Data Type Array ���� > int[] intArray; or int intArray[];
   //2. 9���� int�� ���� �Ҽ� �ִ� ������ ���� array���� new int [9];
   //3. ���� ������ = �� �̿� ���Ժ����� 9�� ������ ��ġ���� ���� i = new int [9];
   //4. array ����, ����, ��ġ���� �븳, �� ���ÿ�
   int[] intArray = new int[9];

   //5. �� ��ġ�� value ����
   intArray[0] =1;
   intArray[1] =2;
   intArray[2] =3;
   intArray[3] =4;
   intArray[4] =5;
   intArray[5] =6;
   intArray[6] =7;
   intArray[7] =8;
   intArray[8] =9;

   // Array ����, ����, ��ġ����, value������ ���ÿ�
   // int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9}
   // int[] intArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}

   //�迭�� index�� �̿� ������ value ����
   for(int j=0; j<9; j++){
      System.out.println("intArray["+j+"] ���� : "+intArray[j]);
   }

   //�� ���� ���� �̿��Ͽ� 5���� ��� intArrayi.length
   // . Operator �� length keyword ���
   System.out.println("=====================");
   for (int k=0; k<intArray.length; k++){
     System.out.println("5 X"+intArray[k]+" = " +5*intArray[k]);     
   }

   // �Ʒ��� ��³����� ���� primitive int i =0
   int[] j = intArray;
   System.out.println("=====================");
   System.out.println("j[0]�� �� : "+j[0]);
   System.out.println("j[5]�� �� : "+j[5]);

   //�� ����� �����ߴٸ�
   j[5] = 1234;
   System.out.println("j[5] ==> "+j[5]);
   System.out.println("i[5] ==> "+ intArray[5]);
   
    }//end of main
  
}//end of class
