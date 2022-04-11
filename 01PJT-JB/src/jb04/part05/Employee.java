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
		System.out.println("Employee �� name�� �޴� Constructor");	
	}
	
	public Employee(String name, String part)
	{
		this(name);
		this.part = part;
		System.out.println("Employee �� name, part�� �޴� Constructor");	
	}

	public Employee(String name, String part, int age)
	{
		this(name, part);
		this.age = age;
		System.out.println("Employee �� name, part, age�� �޴� Constructor");	
	}

	public int salary()
	{
		System.out.println("Employee �� salary() method");
		baseSalary =100;
		return baseSalary;	
	}
}