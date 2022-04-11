public class Prob2
{
    //main method
    public static void main (String[] args)
    {
		int month = Integer.parseInt(args[0]);
		new Prob2().printSeason(month);
	}//end of main

	public void printSeason(int month){
		
		//여기에 구현
		String ans ="";
		switch(month){
			
			case 3: case 4: case 5:
			ans = "봄 에 태어나셨네요.";
			break;

			case 6: case 7: case 8:
			ans = "여름 에 태어나셨네요.";
			break;

			case 9: case 10: case 11:
			ans = "가을 에 태어나셨네요.";
			break;

			case 12: case 1: case 2:
			ans = "겨울 에 태어나셨네요.";
			break;
			 

			default:
		    System.out.println("1~12 사이의 숫자만 입력하셔야 합니다.");  
		} 
		System.out.println(ans); 
	}
}//end of class