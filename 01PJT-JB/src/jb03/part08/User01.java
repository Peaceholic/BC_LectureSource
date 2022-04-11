package jb03.part08;

/*
:: Constructor 0
1. �ν��Ͻ� ������ new A()�� �ǹ��� ����
2. new �� ���� ���Ǵ� Ư���� ������ �ϴ� method 0����
3. Constructor �� �۾�, �뵵��?
*/

public class User01{

    //Field
    String name = " 5";
    int JavaLevel = 0;

    //default Constructor
    // 1. ClassName
    // 2. return Type ����
    
    public User01(){
        System.out.println("Constructor Method");
    }
    
    // Method
    // getter Method definition

    public String getName(){
        return name;
    }

    public int getJavaLevel(){
        return JavaLevel;
    }

    //Main Method
    public static void main(String[] args){
        
        System.out.println("=====================");
        User01 user =new User01();
        System.out.println("=====================");

        // ��°���� Ȯ���ϰ� �Ʒ��� �ּ��� Ǯ�� �ٽ�Ȯ���ϸ�
        
        /*
         System.out.println("=====================");
         User01 user;
         System.out.println("=====================");
         user =new User01();
         System.out.println("=====================");
         new User01();
         System.out.println("=====================");
        */

        System.out.println("name : "+user.getName());
        System.out.println("javalevel : "+user.getJavaLevel());
    }
}