package jb04.part03;

public class Employee 
{
	String part, name;
	int age, baseSalary;

	public Employee()
	{
		System.out.println("1-Employee class default Constructor");	
	}

	public Employee(String str)
	{
		name = str;
		System.out.println("2-Employee �� name�� �޴� Constructor");	
	}
	
	public Employee(String str1, String str2)
	{
		this(str1);
		part = str2;
		System.out.println("3-Employee �� name, part�� �޴� Constructor");	
	}

	public Employee(String str1, String str2, int i)
	{
		this(str1, str2);
		age = i;
		System.out.println("4-Employee �� name, part, age�� �޴� Constructor");	
	}

	public int salary()
	{
		System.out.println("Employee �� salary() method");
		baseSalary =100;
		return baseSalary;	
	}
}