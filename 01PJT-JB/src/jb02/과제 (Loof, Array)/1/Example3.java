
public class Example3 {
 
    public static void main(String[] args) {

		if (args.length != 2){
			System.out.print("�� ���� �Է��ϼ���");		
			return;
		}
		
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int temp = 0;

		if (num1 == num2)
		{
			System.out.println(num1+"�� "+num2+"�� ���ڰ� �����ϴ�. �ٸ����� �Է��ϼ���.");
			return;
   		}
		
		if (num1>num2){

			temp = num1;
			num1 = num2;
			num2 = temp;
		}

		int sum = 0;
		for(int con = num1; con<=num2; con++){
		    sum+=con;		
		}

        System.out.println(num1+"�� "+num2+"�� ������ ���� "+sum+"�Դϴ�.");       
    } 
}