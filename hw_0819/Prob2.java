public class  Prob2
{
	public static void main(String[] args) 
	{

		int num1 = 6;
		int num2 = 15;
		
		Prob2 prob = new Prob2();
		System.out.println("두수의 차는 = " + prob.abs(num1, num2));	
	}

	public int abs(int num1, int num2){
		
		int temp = num1 - num2;

		if (temp < 0)
		{
			temp *=-1 ;
		}
		
		return temp;
	}
}
