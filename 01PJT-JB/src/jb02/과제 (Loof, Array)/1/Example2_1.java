import java.io.Console;
 
public class Example2_1 {
 
    public static void main(String[] args) {
                        
        String sNum = "" ;
       
	    Console console = System.console() ;
         
        sNum = console.readLine("%s", "���ϴ� ������ ���ڸ� �Է��� �ּ��� : ");
        
        int num = Integer.parseInt(sNum);
      
        System.out.println(num+"���� ����մϴ�.");

        int con = 1;
        while(con<=9){
		System.out.println(num+" * "+con+" = "+(num*con));
        con++;
		}
    }
}
