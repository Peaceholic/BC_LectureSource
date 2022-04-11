import java.io.Console;
 
public class Test2_1 {
 
    public static void main(String[] args) {
                        
        String sNum1 = "" ;
        String sNum2 = "" ;
         
        Console console = System.console() ;
         
        sNum1 = console.readLine("%s", "첫번째 숫자를 입력해 주세요 : ");
        sNum2 = console.readLine("%s", "두번째 숫자를 입력해 주세요 : ");
        
        int num1 = Integer.parseInt(sNum1);
        int num2 = Integer.parseInt(sNum2);

        System.out.println("") ;

        if(num1>num2){
            System.out.println("첫번째인수 : "+num1+", 두번째인수 : "+num2+ ", "+num1+" - "+num2+" = "+(num1-num2)+" 입니다.");     
        } else if(num1<num2){
            System.out.println("첫번째인수 : "+num1+", 두번째인수 : "+num2+ ", "+num1+" + "+num2+" = "+(num1+num2)+" 입니다.");
        }
    }
 
}
