import java.util.Scanner;

public class Prob02
{
    //main method
    public static void main (String[] args)
    {
		// �Ʒ��� �����ϼ���
		Scanner keyboard = new Scanner(System.in);
     	System.out.println("���� ������ �Է��ϼ���.\n");
		int limit = keyboard.nextInt();
		//int limit = 50;
		
		int i = 2; // i - ���� ���
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