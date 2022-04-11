package jp02.part04;

/* FileName : FindOddExceptionTestjava
1. Exeption.class���, ���ο� Exception ����
2. User Definition Exception : JRE ���� ���ܸ� ���� �� �߻� �Ұ�..
3. User Definition Exception : ���α׷����� �����ڰ� �ʿ�� ����, �߻� ���Ѿ��Ѵ�.
( throw �� ��� : User Definition Exception �߻���Ű��)
==> User Definition Exception
*/

class FindOddException extends Exception{
    //Field
    //Constructor
    public FindOddException(){
        System.out.println("==> FindOddException Default Constructor");
    }

    public FindOddException(String msg){
        super(msg);
        System.out.println("==> ���ڰ� �ִ� FindOddException Constructor");
    }
}//end of class 

public class FindOddExceptionTest{
    // Field
    //Constructor
    public FindOddExceptionTest(){
    }

    // Method
    // Ȧ���� �ԷµǸ� FindOddException �߻� ��Ű�� Method
    public void test(int number) throws FindOddException{
        System.out.println(":: "+this.getClass().getName()+" start.");

        if( number % 2 == 0 ){
            System.out.println("�Է��Ͻ� ��: "+number);
        }else{
            throw new FindOddException("aaa");
        }
        System.out.println(":: "+this.getClass().getName()+" end.\n");
    }

    //Main method
    public static void main(String args[]){
        FindOddExceptionTest met = new FindOddExceptionTest();
        
        try{
            met.test(10);
            met.test(11); 
        }catch(FindOddException e ){
            System.out.println("\n e : " +e);
        }
    }
}