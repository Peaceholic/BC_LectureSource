// �Է¹��� ���ڿ�(str) ���̰� �Է¹��� ��(size)�� �ɶ����� ���ڿ��� ������ ������ ���ڷ�(padChar)�� ä���� ����
// �� ���ڿ�(str)���̰� ���� ��(size)���� ū ���� �������� �״�� ����

import java.lang.String;

public class Prob2
{
    //main method
    public static void main (String[] args)
    {
		Prob2 prob = new Prob2();
		System.out.println(prob.leftPad("ABC", 6, '#')); //### ABC
		System.out.println(prob.leftPad("ABC", 5, '$')); //$$ ABC
		System.out.println(prob.leftPad("ABC", 2, '&')); //ABC
		
    }//end of main  
		
	public String leftPad(String str, int size, char padChar){

		//����
		String result ="";
		for (int j=0; j<size-str.length(); j++){
			result += Character.toString(padChar);			 
		}
		result +=str;

		return result;		
	}
}//end of class
