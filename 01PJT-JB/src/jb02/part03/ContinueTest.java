package jb02.part03;

/*
   FileName : ContinueTest.java

   // keyword : continue; > continue ���� ���๮�� �ߴ�, �ܽ� �ݺ��� ����

   // continue���� �̿��Ͽ� ¦���� ���ϱ�
   // java ContinueTest 5 > 1~5�� ¦���� 2, 4�� ���� 6���� ���
*/

public class ContinueTest {
	// main method
	public static void main (String[] args)
    {

     //�Է¹��� data�� int��ȯ
     int inputData = Integer.parseInt(args[0]);

     //���Ѱ� �����ϴ� ���� ����
     int sum=0;

     for(int i=0; i<=inputData; i++){
         if(i%2==1) { //Ȧ���̸�
             continue;
         }
         sum = sum + i;

         // �Ʒ��� ������ for��ȯ���� Debug �� ���� ��¹�
         System.out.println("i : " +i);
         System.out.println("sum : " +sum);
     }
         System.out.println("0 ~ "+inputData+" ������ ¦���� ���� : "+sum); 
  }// end of main

}// end of class