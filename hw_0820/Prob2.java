public class Prob2
{
    //main method
    public static void main (String[] args)
    {
		int month = Integer.parseInt(args[0]);
		new Prob2().printSeason(month);
	}//end of main

	public void printSeason(int month){
		
		//���⿡ ����
		String ans ="";
		switch(month){
			
			case 3: case 4: case 5:
			ans = "�� �� �¾�̳׿�.";
			break;

			case 6: case 7: case 8:
			ans = "���� �� �¾�̳׿�.";
			break;

			case 9: case 10: case 11:
			ans = "���� �� �¾�̳׿�.";
			break;

			case 12: case 1: case 2:
			ans = "�ܿ� �� �¾�̳׿�.";
			break;
			 

			default:
		    System.out.println("1~12 ������ ���ڸ� �Է��ϼž� �մϴ�.");  
		} 
		System.out.println(ans); 
	}
}//end of class