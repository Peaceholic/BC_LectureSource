package jb04.part03;

/*
	FileName : Human01.java
	1. ���(�Ϲ�ȭ����)�� �����ڿ��� ����
	2. �����ڸ� ��������� ȣ���ϴ� this(), super() method 
*/
public class Human01{
	///Field	
	String name;

	///Constructor
	public Human01(){
		System.out.println("1-Human class default Constructor");
	}
	public Human01(String str){
		System.out.println("2-Human class�� String ���ڸ� �޴� Constructor");
		name = str;
	}
}//end of class