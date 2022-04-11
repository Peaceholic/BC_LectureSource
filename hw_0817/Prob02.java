import java.util.Scanner;

public class Prob02
{
    //main method
    public static void main (String[] args)
    {
		// 아래에 구현하세요
		Scanner keyboard = new Scanner(System.in);
     	System.out.println("양의 정수를 입력하세요.\n");
		int limit = keyboard.nextInt();
		//int limit = 50;
		
		int i = 2; // i - 나눌 대상
		boolean check = true;
		
		while (i <= limit) {
			check = true;

			for (int n = 2; n < i; n++) {

				if (i % n == 0) {
					check = false;
				}				
				continue;
			}
			
			if (check == true){
				System.out.println(i);
			}			
			i++;
		}

	} //end of main
}// end of class