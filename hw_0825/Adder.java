public class Adder
{
    //main method
    public static void main (String[] args)
    {
		Adder adder = new Adder();

		String expr = "3+5+9+1";
		System.out.println(expr+ "=" + adder.execute(expr));

		expr = "11+45+77+3";
		System.out.println(expr+ "=" + adder.execute(expr));

		expr = "33+51+12+11";
		System.out.println(expr+ "=" + adder.execute(expr));
		
    }//end of main  

	//아래 작성 후 본인의 메소드 작성
	/*
	public int execute(String expr){
		int result = 0;
		String strNum ="";
		for (int i=0; i<expr.length();i++) //구현
		{
			char c = expr.charAt(i); //구현
	
			if(c=='+'){
				result += Integer.parseInt(strNum);
				strNum = ""; //구현
			
			} else {
				strNum += Character.toString(c); //구현
			}
		}
		return result+Integer.parseInt(strNum); //구현
 	}
	*/

	public int execute(String expr){
		int result = 0;
		String strNum ="";
		for (int i=0; i<expr.length();i++)
		{
			if(expr.charAt(i)=='+'){
				result += Integer.parseInt(strNum);
				strNum = "";
				
			} else {
				strNum = strNum.concat(Character.toString(expr.charAt(i))); //구현
			}
		}
		return result+Integer.parseInt(strNum);
	}
	

}//end of class