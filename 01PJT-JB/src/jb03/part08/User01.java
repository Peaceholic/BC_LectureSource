package jb03.part08;

/*
:: Constructor 0
1. 인스턴스 생성시 new A()의 의미의 이해
2. new 와 같이 사용되는 특수한 행위를 하는 method 0이해
3. Constructor 주 작업, 용도는?
*/

public class User01{

    //Field
    String name = " 5";
    int JavaLevel = 0;

    //default Constructor
    // 1. ClassName
    // 2. return Type 없음
    
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

        // 출력결과를 확인하고 아래의 주석을 풀어 다시확인하면
        
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