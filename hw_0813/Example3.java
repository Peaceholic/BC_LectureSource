
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
			System.out.println(num1+"과 "+num2+"의 숫자가 같습니다. 다른수를 입력하세요.");
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

        System.out.println(num1+"과 "+num2+"의 사이의 합은 "+sum+"입니다.");
       
    }
 
}
