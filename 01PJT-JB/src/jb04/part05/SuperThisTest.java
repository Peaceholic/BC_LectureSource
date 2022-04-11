package jb04.part05;

class JuniorHighSchool
{
	String name = "a-���б�";

	public JuniorHighSchool(){
	}

	public void schoolName(){
		System.out.println("1- >> ���б� �̸� :  "+name);
	}
}

class HighSchool extends JuniorHighSchool
{
	String name = "b-����б�";
	int age = 1111;

	public HighSchool(){
	}

	public HighSchool(String str){
		name = str;
		int age = 2222;
		System.out.println("2- >>  "+age);
		System.out.println("3- >>  "+this.age);
	}

	/*
	public HighSchool(String name){
		this.name = str; 
		// ���� ��
	}
	*/

	public void schoolName(){
		System.out.println("4- >> ���б� �̸� :  "+super.name);
		System.out.println("5- >> ����б� �̸� :  "+this.name);
		System.out.println("6- >> ����б� �̸� :  "+name);           //this. ����������
		System.out.println("7- >> ����б� �̸� :  "+this. getName());
	}

	public String getName(){	
		return this.name;
	}

}

public class SuperThisTest
{
	public static void main(String[] args) 
	{
		HighSchool hs01 = new HighSchool();
		hs01.schoolName();

		System.out.println("=============");

		HighSchool hs02 = new HighSchool("hs02 c-�������б�");
		hs02.schoolName();
	}
}