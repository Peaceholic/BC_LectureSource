import java.io.Console;
 
public class Example2_1 {
 
    public static void main(String[] args) {
                        
        String sNum = "" ;
       
	    Console console = System.console() ;
         
        sNum = console.readLine("%s", "원하는 구구단 숫자를 입력해 주세요 : ");
        
        int num = Integer.parseInt(sNum);
      
        System.out.println(num+"단을 출력합니다.");

        int con = 1;
        while(con<=9){
		System.out.println(num+" * "+con+" = "+(num*con));
        con++;
		}
    }
}
