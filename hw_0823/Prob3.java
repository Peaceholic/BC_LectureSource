// 1. 개별 클레스 생성
// 2. 상속 클레스 생성
// 3. for loop 사용
public class Prob3
{
    //main method
    public static void main (String[] args)
    {
		Student s = new Student("홍길동", 20, 200201);
		Teacher t = new Teacher("이순신", 30, "JAVA");
		Employee e = new Employee("유관순", 40, "교무과");

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
		System.out.print("이 름 : "+name+"   나 이 : "+age);
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
		System.out.println("   학   번 : "+id);
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
		System.out.println("   담당과목 : "+subject);
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
		System.out.println("   부   서 : "+dept);
	}

}//end of Employee sub class


/* Student, Teacher, Employee Class 개별로 구성
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
		System.out.println("이 름 : "+name+"   나 이 : "+age+"   학   번 : "+id);
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
		System.out.println("이 름 : "+name+"   나 이 : "+age+"   담당과목 : "+subject);
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
		System.out.println("이 름 : "+name+"   나 이 : "+age+"   부   서 : "+dept);
	}
}//end of employee class

*/