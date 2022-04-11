package jp02.part05;

/*
<< Anonymous Inner Class 0 >>
1. class �� �̸��� ���� ��Ư�� class
*/

class A{
    
    //Field
    //Constructor
    //Method
    public void abc(String message){
        System.out.println(": "+this.getClass().getName()+" start.");
        System.out.println("::abc() "+message);
        System.out.println(":: "+this.getClass().getName()+" end.");
    }
}//end of class


public class AnonymousInnerClass{

  //Main method
  public static void main(String[] args) {

    //1. �ν��Ͻ� ����, �ĺ�������.. Method ����
    System.out.println("1.============================");
    A a = new A();
    a.abc("Hello");

    //2. �ν��Ͻ� ���� �� �ٷ� Method ����
    System.out.println("2.=============================");
    new A().abc("Hello");

/*
    �Ʒ��� �ڵ带 ����
    public class B extneds A{
        public void def(String message){
            System.out.println(":: Hi "+message);
        }
    }
    new B().abc("Hello");
    new B().def("Hello");
*/

//3. ���� �ڵ带 �����Ѵٸ�, �Ʒ��� �ڵ��
//==> Anonymous (�͸�,�Ҹ� : �̸��� ���� )
//==> ���� �ҽ����� public class B extends�� �����

    System.out.println("3.================================");
    new A(){
        public void def(String message){
            System.out.println(": "+this.getClass().getName()+" start.");
            System.out.println(": def() "+message);
            System.out.println(": "+this.getClass().getName()+" end..");
        }
    }.def("Hello");

    System.out.println("4.================================");
    new A(){
        public void def(String message){
            System.out.println(": "+this.getClass().getName()+" start.");
            System.out.println(": def() "+message);
            System.out.println(": "+this.getClass().getName()+" end..");
        }
    }.def("Hello");


	/*
	//���� ����
	public class B extneds A{
        public void def(String message){
            System.out.println(":: Hi "+message);
        }
    }
    */
	// ����1
    new A(){
        public void def(String message){
            System.out.println(":: Hi "+message);
        }
    }.abc("Hello");
    
	// ����2
	new A(){
        public void def(String message){
            System.out.println(":: Hi "+message);
        }
    }.def("Hello");
	
  }
}