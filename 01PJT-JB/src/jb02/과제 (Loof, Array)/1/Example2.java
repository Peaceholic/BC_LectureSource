public class Example2 {
 
    public static void main(String[] args) {
		
		if (args.length != 1){
			System.out.println("1�̻� 100������ ������ �Է��ϼ���");		
			return;
		}
        
        int num = Integer.parseInt(args[0]);
      
        System.out.println(num+"���� ����մϴ�.");   
        
		for(int con =1; con <=9 ;con++){
			System.out.println(num+" * "+con+" = "+(num*con));			
		}		
    }
}
