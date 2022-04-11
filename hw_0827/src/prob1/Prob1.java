package prob1;
//1. String api 없이 구현
//2. String Methodd - replace, replaceAll 사용해보기
//3. StringTokenizer Class 사용해보기

public class Prob1
{
    public static void main (String[] args)
    {
		System.out.println("문자열에 특정문자를 변경하는 테스트");		
		System.out.println("==========Sampl1==========");
		String str1 = myReplace("hello world", 'l', '*');		
		System.out.println(str1);

		System.out.println("==========Sampl2==========");
		String str2 = myReplace("hello world", ' ', '-');		
		System.out.println(str2);

		System.out.println("==========Sampl1==========");
		String str3 = myReplace("hello world", 'a', '*');		
		System.out.println(str3);		
	
	}//end of main

	public static String myReplace(String str, char oldChar, char newChar){

		String temp ="";
	
		for(int i=0; i<str.length(); i++){							
			if (str.charAt(i) != oldChar){
				temp+=Character.toString(str.charAt(i));										
			} else {
				temp+=Character.toString(newChar);								
			}				
		}			
		return temp;
	}
	
}//end of class