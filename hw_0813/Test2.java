public class Test2 {
 
    public static void main(String[] args) {
                        
        String sNum1 = args[0] ;
        String sNum2 = args[1] ;        

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
