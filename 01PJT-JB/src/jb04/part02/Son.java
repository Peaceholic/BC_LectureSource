package jb04.part02;

public class Son extends Iam 
{
	String school;

	public Son(){
		System.out.println("Son class default Constructor");
	}

	public void setSchool(String str){
		school =str;	
	}

	public String getSchool(){
		return school;	
	}

	public static void main(String[] args) 
	{
		Son son = new Son();

		son.setName("홍길동");
		son.setAge(50);
		son.setJob("개발자");
		son.setSchool("아이티교육센터");

		System.out.println("이름 : "+son.getName());
		System.out.println("나이 : "+son.getAge());
		System.out.println("직업 : "+son.getJob());
		System.out.println("학교 : "+son.getSchool());
	}
}
