package jb04.part07;

public class Father
{
    public String name = "ȫ�浿";       // public    - ������ ���ٰ���
    protected String bank = "�Ѿ�����";  // protected - ��Ӱ���, ���� package ���ٰ���
    String branch = "���ﵿ����";        // (       ) - ���� package ���ٰ���
	private int password = 1234;         // private   - �ڽŸ� ���ٰ���   
	int baseSalary;

	public Father()
	{
    }

	public String getBank(int pwd)
	{
        if(pwd != 7777){
            return "key ���� ��Ȯ�� �Է��ϼ���";
        } else {
            return this.bank;     
        }
	}

    public int getPassword (int key)
	{
        if(key != 7777){
            return 0;
        } else {
            return this.password;       
        }
	}

    public String getName ()
	{
        return name;
    }

    public String getBranch ()
	{
        return branch;
    }
}