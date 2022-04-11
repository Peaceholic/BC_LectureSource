import java.util.Scanner;

public class Prob02
{

    //main method
    public static void main (String[] args)
    {
		int year=0;
		int month = 2;
		int maxDay = 0;

		// 아래에 구현하세요

		Scanner keyboard = new Scanner(System.in);
		System.out.println("년도를 입력하세요");
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

		System.out.println(year +"년 "+month + "월의 말일은 " + maxDay+"일 입니다.");
		
    }//end of main  
}//end of class