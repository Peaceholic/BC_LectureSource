public class Test2 {
 
    public static void main(String[] args) {
                        
        String sNum1 = args[0] ;
        String sNum2 = args[1] ;        

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
