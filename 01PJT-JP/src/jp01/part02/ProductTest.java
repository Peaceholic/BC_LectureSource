package jp01.part02;

/*	
	FieldName :  ProductTest.java  
	
	  1. Reference Data Type �ǹ� �ٽ� Ȯ��
	  2. �������� �����ϰ�,  �����Ͽ� ������ ����� �´��� Ȯ�� 
	  	   ::  Reference Data Type ���ص� Ȯ�� 
*/
class Product{	
  //Field
  String product ="�ݶ�";
 }//end of class


public class ProductTest{
	
	  //main method	
	  public static void main(String[] args){

			Product p01 = new Product();
			System.out.println("p01.product : "+p01.product); // 01�ݶ�

			Product p02 = new Product();
			System.out.println("p02.product : "+p02.product); // 02�ݶ�

			Product p03 = p01;
			System.out.println("p01.product : "+p01.product); // 01�ݶ�
			System.out.println("p03.product : "+p03.product); // 01�ݶ�
			
			p03.product="���̴�";
			System.out.println("p01.product : "+p01.product); // 03���̴�
			System.out.println("p02.product : "+p02.product); // 02�ݶ�
			System.out.println("p03.product : "+p03.product); // 03���̴�

			p02 = p03;
			System.out.println("p01.product : "+p01.product); // 03���̴�
			System.out.println("p02.product : "+p02.product); // 03���̴�
			System.out.println("p03.product : "+p03.product); // 03���̴�
		}//end of main

}//end of class