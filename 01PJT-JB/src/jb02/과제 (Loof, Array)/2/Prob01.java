import java.util.Scanner;

public class Prob01
{

    //main method
    public static void main (String[] args)
    {
		// �Ʒ��� �����ϼ���
		Scanner keyboard = new Scanner(System.in);
		boolean checker = true;

		do{
			System.out.println("1���� ũ�� 10���� ���� ������ �Է��ϼ���.");
		    int inputInt = keyboard.nextInt();

			if(inputInt > 1 && inputInt < 10 ){
				System.out.println(inputInt+"���� ����մϴ�.\n");
				
				for(int i = 0; i < 10; i++){			 
				System.out.println(inputInt+" * "+i+" = "+(inputInt*i));
			    
				}
			 checker = false;
			 }
		 
		     /*
			 if(inputInt > 1 && inputInt < 10 ){
			 System.out.println(inputInt+"�� ���� �Դϴ�.\n");
			 checker = false;			
		     }
		     */
		}while(checker);   

    }//end of main  
}//end of class