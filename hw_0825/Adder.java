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

	//�Ʒ� �ۼ� �� ������ �޼ҵ� �ۼ�
	/*
	public int execute(String expr){
		int result = 0;
		String strNum ="";
		for (int i=0; i<expr.length();i++) //����
		{
			char c = expr.charAt(i); //����
	
			if(c=='+'){
				result += Integer.parseInt(strNum);
				strNum = ""; //����
			
			} else {
				strNum += Character.toString(c); //����
			}
		}
		return result+Integer.parseInt(strNum); //����
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
				strNum = strNum.concat(Character.toString(expr.charAt(i))); //����
			}
		}
		return result+Integer.parseInt(strNum);
	}
	

}//end of class