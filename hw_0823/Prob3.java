// 1. ���� Ŭ���� ����
// 2. ��� Ŭ���� ����
// 3. for loop ���
public class Prob3
{
    //main method
    public static void main (String[] args)
    {
		Student s = new Student("ȫ�浿", 20, 200201);
		Teacher t = new Teacher("�̼���", 30, "JAVA");
		Employee e = new Employee("������", 40, "������");

		s.print();
		t.print();
		e.print();
		
    }//end of main  
}//end of class

class Human
{
	private String name;
	private int age;

	public Human(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

	public String getName()
	{
		return this.name;	
	}

	public void setName(String name)
	{
		this.name = name;	
	}

	public int getAge()
	{
		return this.age;	
	}

	public void setAge(int age)
	{
		this.age = age;	
	}

	public void print()
	{
		System.out.print("�� �� : "+name+"   �� �� : "+age);
	}
	
}//end of Human super class

class Student extends Human
{
	int id;

	public Student(String name, int age, int id)
	{
		super(name, age);
		this.id = id;
	}

	public int getId()
	{
		return this.id;	
	}

	public void setId(int id)
	{
		this.id = id;	
	}

	public void print()
	{
		super.print();
		System.out.println("   ��   �� : "+id);
	}

}//end of Student sub class


class Teacher extends Human
{
	String subject;

	public Teacher(String name, int age, String subject)
	{
		super(name, age);
		this.subject = subject;
	}

	public String getSubject()
	{
		return this.subject;	
	}

	public void setSubject(String subject)
	{
		this.subject = subject;	
	}

	public void print()
	{
		super.print();
		System.out.println("   ������ : "+subject);
	}

}//end of Teacher sub class

class Employee extends Human
{
	String dept;

	public Employee(String name, int age, String dept)
	{
		super(name, age);
		this.dept = dept;
	}

	public String getDept()
	{
		return this.dept;	
	}

	public void setDept(String dept)
	{
		this.dept = dept;	
	}

	public void print()
	{
		super.print();
		System.out.println("   ��   �� : "+dept);
	}

}//end of Employee sub class


/* Student, Teacher, Employee Class ������ ����
class Student 
{
	private String name;
	private int age;
	private int id;

	public Student(String name, int age, int id)
	{
		this.name = name;
		this.age = age;
		this.id = id;	
	}

	public String getName()
	{
		return this.name;	
	}

	public void setName(String name)
	{
		this.name = name;	
	}

	public int getAge()
	{
		return this.age;	
	}

	public void setAge(int age)
	{
		this.age = age;	
	}

	public int getId()
	{
		return this.id;	
	}

	public void setId(int id)
	{
		this.id = id;	
	}

	public void print()
	{
		System.out.println("�� �� : "+name+"   �� �� : "+age+"   ��   �� : "+id);
	}
}//end of student class

class Teacher 
{
	private String name;
	private int age;
	private String subject;

	public Teacher(String name, int age, String subject)
	{
		this.name = name;
		this.age = age;
		this.subject = subject;	
	}

	public String getName()
	{
		return this.name;	
	}

	public void setName(String name)
	{
		this.name = name;	
	}

	public int getAge()
	{
		return this.age;	
	}

	public void setAge(int age)
	{
		this.age = age;	
	}

	public String getSubject()
	{
		return subject;	
	}

	public void setSubject(String subject)
	{
		this.subject = subject;	
	}

	public void print()
	{
		System.out.println("�� �� : "+name+"   �� �� : "+age+"   ������ : "+subject);
	}
}//end of teacher class

class Employee 
{
	private String name;
	private int age;
	private String dept;

	public Employee(String name, int age, String dept)
	{
		this.name = name;
		this.age = age;
		this.dept = dept;	
	}

	public String getName()
	{
		return name;	
	}

	public void setName(String name)
	{
		this.name = name;	
	}

	public int getAge()
	{
		return age;	
	}

	public void setAge(int age)
	{
		this.age = age;	
	}

	public String getDept()
	{
		return this.dept;	
	}

	public void setDept(String dept)
	{
		this.dept = dept;	
	}

	public void print()
	{
		System.out.println("�� �� : "+name+"   �� �� : "+age+"   ��   �� : "+dept);
	}
}//end of employee class

*/