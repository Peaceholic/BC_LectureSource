public class Prob1
{
    //main method
    public static void main (String[] args)
    {
		// 구현후 아래 숫자 변경시에도 만족
		int limit = 67;

		Util util = new Util();

		int primeCount = util.findPrimeCount(limit);
		System.out.println("1~"+limit+" 까지의 소수의 개수는 "+primeCount+"EA 이며 소수는 아래와 같다.");
		System.out.println("/////////////////////////////");

		int[] primeArray = util.findPrimeReturnArray(limit);

		for(int i=0; i<primeArray.length; i++){
			System.out.print(primeArray[i]+((primeArray.length-1)!=i ? "," :""));
		}
	}//end of main
}//end of class