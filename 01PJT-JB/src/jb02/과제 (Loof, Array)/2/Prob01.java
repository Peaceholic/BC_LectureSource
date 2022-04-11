import java.util.Scanner;

public class Prob01
{

    //main method
    public static void main (String[] args)
    {
		// 아래에 구현하세요
		Scanner keyboard = new Scanner(System.in);
		boolean checker = true;

		do{
			System.out.println("1보다 크고 10보다 작은 정수를 입력하세요.");
		    int inputInt = keyboard.nextInt();

			if(inputInt > 1 && inputInt < 10 ){
				System.out.println(inputInt+"단을 출력합니다.\n");
				
				for(int i = 0; i < 10; i++){			 
				System.out.println(inputInt+" * "+i+" = "+(inputInt*i));
			    
				}
			 checker = false;
			 }
		 
		     /*
			 if(inputInt > 1 && inputInt < 10 ){
			 System.out.println(inputInt+"는 정답 입니다.\n");
			 checker = false;			
		     }
		     */
		}while(checker);   

    }//end of main  
}//end of class