// 입력받은 문자열(str) 길이가 입력받은 수(size)가 될때까지 문자열의 좌측을 지정된 문자로(padChar)로 채운후 리턴
// 단 문자열(str)길이가 받은 수(size)보다 큰 경우는 원본열을 그대로 리턴

import java.lang.String;

public class Prob2
{
    //main method
    public static void main (String[] args)
    {
		Prob2 prob = new Prob2();
		System.out.println(prob.leftPad("ABC", 6, '#')); //### ABC
		System.out.println(prob.leftPad("ABC", 5, '$')); //$$ ABC
		System.out.println(prob.leftPad("ABC", 2, '&')); //ABC
		
    }//end of main  
		
	public String leftPad(String str, int size, char padChar){

		//구현
		String result ="";
		for (int j=0; j<size-str.length(); j++){
			result += Character.toString(padChar);			 
		}
		result +=str;

		return result;		
	}
}//end of class
