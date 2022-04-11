package jb04.part05;

public class Employee
{
	String part;
	String name;
	int age;
	int baseSalary;

	public Employee()
	{
		System.out.println("Employee class default Constructor");	
	}

	public Employee(String name)
	{
		this.name = name;
		System.out.println("Employee 의 name을 받는 Constructor");	
	}
	
	public Employee(String name, String part)
	{
		this(name);
		this.part = part;
		System.out.println("Employee 의 name, part을 받는 Constructor");	
	}

	public Employee(String name, String part, int age)
	{
		this(name, part);
		this.age = age;
		System.out.println("Employee 의 name, part, age을 받는 Constructor");	
	}

	public int salary()
	{
		System.out.println("Employee 의 salary() method");
		baseSalary =100;
		return baseSalary;	
	}
}