public class Prob02
{

    //main method
    public static void main (String[] args)
    {
		int year = 2010;
		int month = 2;
		int maxDay = 0;

		// �Ʒ��� �����ϼ���

		maxDay = 28;

		if (year%4 ==0)
		{
			maxDay = 29;
		}

		if (year%4 ==0 && year%100==0)
		{
			maxDay = 28;
		}

		if (year%4 ==0 && year%400==0)
		{
			maxDay = 29;			
		}

		System.out.println(year +"�� "+month + "���� ������ " + maxDay+"�� �Դϴ�.");
		
    }//end of main  
}//end of class