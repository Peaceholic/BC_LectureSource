
public class Example3 {
 
    public static void main(String[] args) {
                        
        String sNum1 = args[0];
        String sNum2 = args[1] ;
                
        int num1 = Integer.parseInt(sNum1);
        int num2 = Integer.parseInt(sNum2);
		int sum = 0;
        int temp = 0;

		if (num1 == num2)
		{
			System.out.println(num1+"�� "+num2+"�� ���ڰ� �����ϴ�. �ٸ����� �Է��ϼ���.");
		}

		if (num1>num2)
		{
			temp = num1;
			num1 = num2;
			num2 = temp;
		}

        System.out.println("");

		for(int con = num1; con<=num2; con++){
		    sum+=con;		
		}

        System.out.println(num1+"�� "+num2+"�� ������ ���� "+sum+"�Դϴ�.");
       
    }
 
}
