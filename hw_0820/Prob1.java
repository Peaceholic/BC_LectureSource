import java.util.Scanner;

public class Prob1
{
    //main method
    public static void main (String[] args)
    {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("1���� ũ�� 10���� ���� ������ �Է��ϼ���");
		int number = keyboard.nextInt();

        // �Է¹��� ���� n ���丮�� ���
		// 2 ~ 9 �� �ƴѰ�� "�߸��� ���� �Է�" �޼��� ��� �� ����
		
		//�Ʒ��� ����
		if( number<2 || number>9 ){
			System.out.println("�߸��� ���ڰ� �ԷµǾ����ϴ�.");		
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