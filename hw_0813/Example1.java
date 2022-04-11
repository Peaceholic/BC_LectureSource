public class Example1{

    public static void main(String[] args){

        String num = args[0] ;
         
        int score = Integer.parseInt(num);
		
	    if( score < 1 || score > 100){
			System.out.print("1이상 100이하의 점수를 입력하세요");			
		} else {

        /*       
			if( score >= 90 ){
                 System.out.print("입력하신 값 "+num+"점은 수 입니다.");

			} else if( score >= 80 ){
                 System.out.print("입력하신 값 "+num+"점은 우 입니다.");
			
			} else if( score >= 70 ) {
                 System.out.print("입력하신 값 "+num+"점은 미 입니다.");

			} else if( score >= 60 ) {
                 System.out.print("입력하신 값 "+num+"점은 양 입니다.");
			
			} else {
                 System.out.print("입력하신 값 "+num+"점은 가 입니다.");

			}			
		*/			
			switch(score/10){
				
				case 10 : case 9 : 
					System.out.print("입력하신 값 "+num+"점은 수 입니다."); //90~100점
					break;   

				case 8 : 
					System.out.print("입력하신 값 "+num+"점은 우 입니다.");  //80~89점
					break;                
				
				case 7 : 
					System.out.print("입력하신 값 "+num+"점은 미 입니다.");  //70~79점
					break;  
					
				case 6 : 
					System.out.print("입력하신 값 "+num+"점은 양 입니다.");  //60~69점
					break;                
        
				default :
					System.out.print("입력하신 값 "+num+"점은 가 입니다.");  //60점 이하
		    }	
		}
   }
}
