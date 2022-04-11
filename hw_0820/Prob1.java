import java.util.Scanner;

public class Prob1
{
    //main method
    public static void main (String[] args)
    {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("1보다 크고 10보다 작은 정수를 입력하세요");
		int number = keyboard.nextInt();

        // 입력받은 수로 n 팩토리얼 출력
		// 2 ~ 9 가 아닌경우 "잘못된 숫자 입력" 메세지 출력 및 종료
		
		//아래에 구현
		if( number<2 || number>9 ){
			System.out.println("잘못된 숫자가 입력되었습니다.");		
		} else {
			
			/*
			int result = 1;
			for (int i = 1; i <= number; i++) {
				result*=i;
				System.out.println(i+ "! = " +result);
			}

			*/
			int temp = 1;
			for (int i = 1; i <= number; i++) {
				temp = 1;
				for (int j = 1; j <= i; j++) {
					temp*=j;
		        }
				System.out.println(i+ "! = " +temp);
			}
			
		}

    }//end of main  
}//end of class