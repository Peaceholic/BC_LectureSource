public class Prob1
{
    public static void main (String[] args)
    {

		int[] ia = new int[]{3, 7, 1, 8, 10, 2, 15, 2, 10};
		int[] ib = new int[]{1, 2, 3, 4, 5};
		
		Prob1 p = new Prob1();
		
		System.out.println("(�迭 ia)");
		Prob1.calc(ia);                   //static 
		System.out.println("(�迭 ib)");
		calc(ib);                         //static 
	
	}//end of main

	public static void calc(int[] ix){

		int oddSum = 0;
		int evenSum = 0;

		for(int x : ix){
			if (x%2==0){
				evenSum+=x;
			} else{
				oddSum+=x;			
			}		
		}
		System.out.println("Ȧ���� �� : "+oddSum);
		System.out.println("¦���� �� : "+evenSum);

	}//end of calc

}//end of class