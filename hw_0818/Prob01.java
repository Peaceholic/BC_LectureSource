import java.util.Scanner;

public class Prob01
{

    //main method
    public static void main (String[] args)
    {
		int number = 0;
		int count = 0;
		int sum = 0;

		Scanner keyboard = new Scanner(System.in);
		System.out.println("양의 정수를 입력하세요");
		number = keyboard.nextInt();

        // 1부터 1000까지 수 중에서 입력 받은 정수의 배수 개수와 합을 계산
		// 아래에 구현하세요

		for(int i =1; i <= 1000; i++){
		
			if(i%number ==0){
				count++;
				sum += i;		
			}
		}

        System.out.println(number + "의 배수 개수 = " + count);
		System.out.println(number + "의 배수 합 = " + sum);
		
    }//end of main  
}//end of class