public class Example1{

    public static void main(String[] args){
       
		if (args.length != 1){
			System.out.println("1�̻� 100������ ������ �Է��ϼ���");		
			return;
		}

        int score = Integer.parseInt(args[0]);
		
	    if( score < 1 || score > 100){
			System.out.println("1�̻� 100������ ������ �Է��ϼ���");		
			return;
		}
       
			String grade = "��";
			switch(score/10){
				
				case 10 : 
				case 9 : 
					break;   

				case 8 : 
					grade = "��";  
					break;                
				
				case 7 : 
					grade = "��"; 
					break;  
					
				case 6 : 
					grade = "��"; 
					break;                
        
				default :
					grade = "��";
		    }	
			System.out.print("�Է��Ͻ� �� "+args[0]+"���� " +grade+ " �Դϴ�.");
   }
}