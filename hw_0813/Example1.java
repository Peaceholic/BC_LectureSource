public class Example1{

    public static void main(String[] args){

        String num = args[0] ;
         
        int score = Integer.parseInt(num);
		
	    if( score < 1 || score > 100){
			System.out.print("1�̻� 100������ ������ �Է��ϼ���");			
		} else {

        /*       
			if( score >= 90 ){
                 System.out.print("�Է��Ͻ� �� "+num+"���� �� �Դϴ�.");

			} else if( score >= 80 ){
                 System.out.print("�Է��Ͻ� �� "+num+"���� �� �Դϴ�.");
			
			} else if( score >= 70 ) {
                 System.out.print("�Է��Ͻ� �� "+num+"���� �� �Դϴ�.");

			} else if( score >= 60 ) {
                 System.out.print("�Է��Ͻ� �� "+num+"���� �� �Դϴ�.");
			
			} else {
                 System.out.print("�Է��Ͻ� �� "+num+"���� �� �Դϴ�.");

			}			
		*/			
			switch(score/10){
				
				case 10 : case 9 : 
					System.out.print("�Է��Ͻ� �� "+num+"���� �� �Դϴ�."); //90~100��
					break;   

				case 8 : 
					System.out.print("�Է��Ͻ� �� "+num+"���� �� �Դϴ�.");  //80~89��
					break;                
				
				case 7 : 
					System.out.print("�Է��Ͻ� �� "+num+"���� �� �Դϴ�.");  //70~79��
					break;  
					
				case 6 : 
					System.out.print("�Է��Ͻ� �� "+num+"���� �� �Դϴ�.");  //60~69��
					break;                
        
				default :
					System.out.print("�Է��Ͻ� �� "+num+"���� �� �Դϴ�.");  //60�� ����
		    }	
		}
   }
}
