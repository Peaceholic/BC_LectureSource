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
            result11 = "¦��";
        } else {
            result11 = "Ȧ��";
        }
        if(num1%3 == 0){
            result12 = "�Դϴ�";
        } else {
            result12 = "�� �ƴմϴ�";
        }

        if(num2%2 == 0){
            result21 = "¦��";
        } else {
            result21 = "Ȧ��";
        }
        if(num2%3 == 0){
            result22 = "�Դϴ�";
        } else {
            result22 = "�� �ƴմϴ�";
        }

        System.out.println("�Է��Ͻ� ù��°���� ���� : "+num1+", �� ���� " +result11+ "�̸� 3�� ���"+result12);     
        System.out.println("�Է��Ͻ� �ι�°���� ���� : "+num2+", �� ���� " +result21+ "�̸� 3�� ���"+result22);  
        
    }
 
}
