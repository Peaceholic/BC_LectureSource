import java.io.Console;
 
public class Test1_1 {
 
    public static void main(String[] args) {
                        
        String userName = "" ;
        String userNum = "" ;
         
        Console console = System.console() ;
         
        userName = console.readLine("%s", "이름을 입력해 주세요 : ");
        userNum = console.readLine("%s", "전화번호를 입력해 주세요 : ");
        
        System.out.println("") ;
        System.out.println("나의 이름은 "+userName+"입니다.") ;
        System.out.println(userName+" 씨의 [hp]는 "+userNum+" 입니다.") ;
 
    }
 
}
