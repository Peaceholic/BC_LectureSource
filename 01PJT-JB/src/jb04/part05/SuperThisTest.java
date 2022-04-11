package jb04.part05;

class JuniorHighSchool
{
	String name = "a-중학교";

	public JuniorHighSchool(){
	}

	public void schoolName(){
		System.out.println("1- >> 중학교 이름 :  "+name);
	}
}

class HighSchool extends JuniorHighSchool
{
	String name = "b-고등학교";
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
		// 위와 비교
	}
	*/

	public void schoolName(){
		System.out.println("4- >> 중학교 이름 :  "+super.name);
		System.out.println("5- >> 고등학교 이름 :  "+this.name);
		System.out.println("6- >> 고등학교 이름 :  "+name);           //this. 은생략가능
		System.out.println("7- >> 고등학교 이름 :  "+this. getName());
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

		HighSchool hs02 = new HighSchool("hs02 c-서울고등학교");
		hs02.schoolName();
	}
}