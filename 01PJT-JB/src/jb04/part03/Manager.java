package jb04.part03;

public class Manager extends Employee 
{
	int salary;

	public Manager()
	{
		System.out.println("5-Manager class default Constructor");	
	}

	public Manager(String str)
	{
		super(str);
		System.out.println("6-Manager �� name�� �޴� Constructor");	
	}
	
	public Manager(String str1, String str2)
	{
		super(str1);
		part = str2;
		System.out.println("7-Manager �� name, part�� �޴� Constructor");	
	}

	public Manager(String str1, String str2, int i)
	{
		super(str1, str2);
		age = i;
		System.out.println("8-Manager �� name, part, age�� �޴� Constructor");	
	}

	public Manager(String str1, String str2, int i, int j)
	{
		super(str1, str2, i);
		salary = j;
		System.out.println("9-Manager �� name, part, age, salary�� �޴� Constructor");	
	}

	public void callSalary()
	{
		System.out.println("Manager �� �⺻���� : "+ salary());
		baseSalary =100;
	}

	public static void main(String[] args) 
	{		
		Manager m1 = new Manager("ȫ�浿");
		System.out.println("1 END ====\n");

		Manager m2 = new Manager("ȫ�浿", "EJB");
		System.out.println("2 END ====\n");

		Manager m3 = new Manager("ȫ�浿", "EJB", 25);
		System.out.println("3 END ====\n");

		Manager m4 = new Manager("ȫ�浿", "EJB", 25, 300);
		System.out.println("4 END ====\n");

		Manager m5 = new Manager();
		System.out.println("5 END ====\n");

		System.out.println("\n");

		System.out.println("Overridind �� Salaryȣ�� : "+m4.salary());
		m4.salary();
	}
}