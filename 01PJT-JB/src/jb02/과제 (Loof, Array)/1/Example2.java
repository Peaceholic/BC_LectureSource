public class Example2 {
 
    public static void main(String[] args) {
		
		if (args.length != 1){
			System.out.println("1이상 100이하의 점수를 입력하세요");		
			return;
		}
        
        int num = Integer.parseInt(args[0]);
      
        System.out.println(num+"단을 출력합니다.");   
        
		for(int con =1; con <=9 ;con++){
			System.out.println(num+" * "+con+" = "+(num*con));			
		}		
    }
}
