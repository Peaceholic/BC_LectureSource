package jb03.part04;

public class MethodSyntax
{
    String name ="ȫ�浿";
	String add = "�Ѿ�";

    public void browerOn()
    {
		System.out.println("browerOn�� �Ѵ�");	
	}

	public boolean documentWork()
    {
		System.out.println("documentWork�� �ϰ� �۾��Ϸ� ������ boolean return");
		return true;
	}

    public int sum(int i, int j)
    {
		System.out.println("<< "+i+" >> �� << "+j+" >> ���� �޾� �� return");
		return(i+j);
	}

    public String getName()
    {
		System.out.println("�̸��� �����մϴ�");
		return name;
	}

	public String getAdd()
    {
		System.out.println("�ּҸ� �����մϴ�");
		return add;
	}

	public String[] getAllinformation()
    {
		String[] str = { name, add };		
		//String[] str = { ȫ�浿, �Ѿ� };
		System.out.println("��� ������ �����մϴ�");
		return str;
	}	
}