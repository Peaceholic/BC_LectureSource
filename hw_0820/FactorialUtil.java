import java.util.Scanner;

public class FactorialUtil
{
    //main method
    public static void main (String[] args)
    {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("input    = ");
		
		// ���丮�� ���
		FactorialUtil util = new FactorialUtil();
		System.out.println("Result    = "+util.factorial(keyboard.nextInt()));
    }//end of main
	
	public int factorial(int input){
		
		//���⿡ ����
		int result=1;

		if( input<2 || input>9 ){
			System.out.println("�߸��� ���ڰ� �ԷµǾ����ϴ�.");		
		} else {		
			for (int i = 1; i <= input; i++) {
				result*=i;		
			}
		}		
		return result;
	}//end of main
}//end of class