package jb04.part07;
//outer

// son, father�� ������Ű��, ��Ӱ���
// �ּ�Ǯ�� �����Ͽ���Ȯ��


public class Son2 extends Father 
{
	public Son2(){
	
       	System.out.println(this.name);    
        // public String name = "ȫ�浿";       // public    - ������ ���ٰ���
		
        System.out.println(bank);         
        // protected String bank = "�Ѿ�����";  // protected - ��Ӱ���, ���� package ���ٰ���
        
        System.out.println(branch);       
        // String branch = "���ﵿ����";        // (       ) - ���� package ���ٰ���

		//System.out.println(password);     
        // private int password = 1234;         // private   - �ڽŸ� ���ٰ���   
        
        System.out.println("���� ���: "+this.getPassword(0));
	}
}