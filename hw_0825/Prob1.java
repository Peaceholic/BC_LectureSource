public class Prob1
{
    //main method
    public static void main (String[] args)
    {
		// ������ �Ʒ� ���� ����ÿ��� ����
		int limit = 67;

		Util util = new Util();

		int primeCount = util.findPrimeCount(limit);
		System.out.println("1~"+limit+" ������ �Ҽ��� ������ "+primeCount+"EA �̸� �Ҽ��� �Ʒ��� ����.");
		System.out.println("/////////////////////////////");

		int[] primeArray = util.findPrimeReturnArray(limit);

		for(int i=0; i<primeArray.length; i++){
			System.out.print(primeArray[i]+((primeArray.length-1)!=i ? "," :""));
		}
	}//end of main
}//end of class