import java.io.Console;
 
public class Test1_1 {
 
    public static void main(String[] args) {
                        
        String userName = "" ;
        String userNum = "" ;
         
        Console console = System.console() ;
         
        userName = console.readLine("%s", "�̸��� �Է��� �ּ��� : ");
        userNum = console.readLine("%s", "��ȭ��ȣ�� �Է��� �ּ��� : ");
        
        System.out.println("") ;
        System.out.println("���� �̸��� "+userName+"�Դϴ�.") ;
        System.out.println(userName+" ���� [hp]�� "+userNum+" �Դϴ�.") ;
 
    }
 
}
