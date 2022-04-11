public class Example2 {
 
    public static void main(String[] args) {
                        
        String sNum = args[0];
       
        int num = Integer.parseInt(sNum);
      
        System.out.println(num+"단을 출력합니다.");

        int con = 1;
        while(con<=9){
		System.out.println(num+" * "+con+" = "+(num*con));
        con++;
		}
    }
}
