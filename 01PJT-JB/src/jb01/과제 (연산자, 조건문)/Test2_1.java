import java.io.Console;
 
public class Test2_1 {
 
    public static void main(String[] args) {
                        
        String sNum1 = "" ;
        String sNum2 = "" ;
         
        Console console = System.console() ;
         
        sNum1 = console.readLine("%s", "ù��° ���ڸ� �Է��� �ּ��� : ");
        sNum2 = console.readLine("%s", "�ι�° ���ڸ� �Է��� �ּ��� : ");
        
        int num1 = Integer.parseInt(sNum1);
        int num2 = Integer.parseInt(sNum2);

        System.out.println("") ;

        if(num1>num2){
            System.out.println("ù��°�μ� : "+num1+", �ι�°�μ� : "+num2+ ", "+num1+" - "+num2+" = "+(num1-num2)+" �Դϴ�.");     
        } else if(num1<num2){
            System.out.println("ù��°�μ� : "+num1+", �ι�°�μ� : "+num2+ ", "+num1+" + "+num2+" = "+(num1+num2)+" �Դϴ�.");
        }
    }
 
}
