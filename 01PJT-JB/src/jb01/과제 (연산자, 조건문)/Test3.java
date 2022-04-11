public class Test3 {
 
    public static void main(String[] args) {
                        
        String sNum1 = args[0] ;
        String sNum2 = args[1] ;        
         
        int num1 = Integer.parseInt(sNum1);
        int num2 = Integer.parseInt(sNum2);

        System.out.println("") ;

        String result11 = "";
        String result12 = "";
        String result21 = "";
        String result22 = "";

        if(num1%2 == 0){
            result11 = "짝수";
        } else {
            result11 = "홀수";
        }
        if(num1%3 == 0){
            result12 = "입니다";
        } else {
            result12 = "가 아닙니다";
        }

        if(num2%2 == 0){
            result21 = "짝수";
        } else {
            result21 = "홀수";
        }
        if(num2%3 == 0){
            result22 = "입니다";
        } else {
            result22 = "가 아닙니다";
        }

        System.out.println("입력하신 첫번째인자 값은 : "+num1+", 이 수는 " +result11+ "이며 3의 배수"+result12);     
        System.out.println("입력하신 두번째인자 값은 : "+num2+", 이 수는 " +result21+ "이며 3의 배수"+result22);  
        
    }
 
}
