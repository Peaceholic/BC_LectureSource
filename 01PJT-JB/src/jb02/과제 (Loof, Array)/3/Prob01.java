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
		System.out.println("���� ������ �Է��ϼ���");
		number = keyboard.nextInt();

        // 1���� 1000���� �� �߿��� �Է� ���� ������ ��� ������ ���� ���
		// �Ʒ��� �����ϼ���

		for(int i =1; i <= 1000; i++){
		
			if(i%number ==0){
				count++;
				sum += i;		
			}
		}

        System.out.println(number + "�� ��� ���� = " + count);
		System.out.println(number + "�� ��� �� = " + sum);
		
    }//end of main  
}//end of class