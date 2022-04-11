public class Example1{

    public static void main(String[] args){
       
		if (args.length != 1){
			System.out.println("1이상 100이하의 점수를 입력하세요");		
			return;
		}

        int score = Integer.parseInt(args[0]);
		
	    if( score < 1 || score > 100){
			System.out.println("1이상 100이하의 점수를 입력하세요");		
			return;
		}
       
			String grade = "수";
			switch(score/10){
				
				case 10 : 
				case 9 : 
					break;   

				case 8 : 
					grade = "우";  
					break;                
				
				case 7 : 
					grade = "미"; 
					break;  
					
				case 6 : 
					grade = "양"; 
					break;                
        
				default :
					grade = "가";
		    }	
			System.out.print("입력하신 값 "+args[0]+"점은 " +grade+ " 입니다.");
   }
}