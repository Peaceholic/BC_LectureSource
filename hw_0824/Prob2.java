 import java.lang.String;

public class Prob2
{
    //main method
    public static void main (String[] args)
    {

		// API - java.lang.String
		// char c1 =' ';
		// int i1 = (int)c1;
		// char c1r = (char)i1;		
	
		String sourceString = "everyday we have is one more than we deserve";
		String encodedString = "";

		//구현
		encodedString = ceaserCipher(sourceString);

		System.out.println("암호화 전 문자열 : " + sourceString);
		System.out.println("암호화 후 문자열 : " + encodedString);
		
    }//end of main  

	public static String ceaserCipher(String sin){

		String sout ="";
		
		for(int i =0; i<sin.length(); i++){
			
			//char x = helper(sin.charAt(i));	
			char x = ' ';  
			if((int)sin.charAt(i) >= 120){
				x = (char)((int)sin.charAt(i)-23);
			} else if((int)sin.charAt(i) == 32){
				x = ' ';
			} else {
				x = (char)((int)sin.charAt(i) + 3);		
			}
			sout = sout.concat(Character.toString(x));
		}				
		return sout;
	}

    /*	
	public static char helper (char cin){
			
		//if((int)cin >= 120){
		// 	return (char)((int)cin -23);
		//} else if((int)cin == 32){
		//	return ' ';
		//} else {
		//	return (char)((int)cin + 3);		
		//}
		
		if(temp == 120){        //char x_120 =>  a_97' ;
			return 'a';		
		} else if(temp == 121){ //char y_121 =>  b_98' ;
			return 'b';
		} else if(temp == 122){ //char z_122 =>  c_99' ;
			return 'c';
		} else if(temp == 32){ //char ''_ =>  c_' ;
			return ' ';
		} else {
			return (char)((int)cin + 3);		
		}			
	}
	*/
}//end of class
