import java.util.Scanner;

public class Prob02
{

    //main method
    public static void main (String[] args)
    {
		int year=0;
		int month = 2;
		int maxDay = 0;

		// �Ʒ��� �����ϼ���

		Scanner keyboard = new Scanner(System.in);
		System.out.println("�⵵�� �Է��ϼ���");
		year = keyboard.nextInt();

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