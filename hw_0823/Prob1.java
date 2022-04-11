
// Prob1 - CMD입력과 , *을 이용 역삼각형그리기

public class Prob1
{
    //main method
    public static void main (String[] args)
    {
		int input = Integer.parseInt(args[0]);

        if( input <=0 || input%2 ==0){
			System.out.print("0보다 큰 홀수만 입력 가능합니다.");
			System.exit(0);
			//return
		
		} else {
			 makeStar(input);
		}
    }//end of main  

	public static void makeStar(int number){

			int space = 0 ;
            int star = number;
			for(int con = 0; con <number/2+1; con++){
				
				for(int con2 = 0; con2 <space; con2++){
					System.out.print(" ");
				}
				space++;

				for(int con3 = 0; con3 < star; con3++){
					System.out.print("*");
				}							
				star-=2;

                System.out.println();			
			}

	}
}//end of class