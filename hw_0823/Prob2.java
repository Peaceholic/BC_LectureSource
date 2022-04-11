
//  구구단 출력

public class Prob2
{
    //main method
    public static void main (String[] args)
    {
		System.out.println("주어진 숫자까지의 구구단을 찍습니다.");
		System.out.println("------------ Sample 1 --------------");
		printGugudan(4);

		System.out.println("------------ Sample 2 --------------");
		printGugudan(9);

		System.out.println("------------ Sample 3 --------------");
		printGugudan(-1);

		System.out.println("------------ Sample 4 --------------");
		printGugudan(10);

    }//end of main  


	public static void printGugudan(int no)
	{
		//여기에 구현
		if(no <= 0 || no >= 10 ){
			System.out.println("1 이상 9 이하의 값을 입력하셔야 합니다.");	

		} else {
			
			int[][] temp = new int[9][no];

			for (int con1=0; con1 < temp.length; con1++ ){
				for (int con2=0; con2 < temp[con1].length; con2++){
					temp[con1][con2] = (con1+1) * (con2+1);
					System.out.print( con2+1+" * "+(con1+1)+" = "+temp[con1][con2]+"   ");
				}
				System.out.println();
			}
		}		
	}//end of printGugudan
}//end of class