package jb01.part02;

/*
   FileName : Hello.java
*/

public class Hello
{
  // ==> 1�� �ּ� : �����Ͻ� �ּ����� �����Ͻ� ����
  // java ���࿡ �ʿ��� method : main method
  public static void main (String[] args)
  {
    System.out.println("Hello Java :: �ȳ� �ڹ�");  

  int a;
  a=1;
  int b = 0;
  char c;
  c ='C';
  char d =' ';
  char e ='e';
  String g="";
  String h="h";

  System.out.println(a);
  System.out.println(b);
  System.out.println(c);
  System.out.println(d);
  System.out.println(e);
  System.out.println("");
  System.out.println(g);
  System.out.println(h);


  }
  



  //end of main

}//end of class

/* ==> ���ٹ� �ּ� : �����Ͻ� ����

   << ���ǻ��� �� ��ӻ��� >>
   1. class name �� file name �� �����ؾ� �Ѵ�.
      ��) public class Hello �� ==> Hello.java (File Name)
   2. ��ҹ��ڸ� ����
   3. ����� public static void main (String[] args) �ʿ�
   4. System.out.println( ~~~ ); ==> ~~~ Console ���
   5. Hell.java ������ �� Hello.class(ByteCode) ����Ȯ��

   << Console(DOS ȭ��)���� compile & run >>
   1. File save
      FileName : Hello.java ==> FileName�� ClassName�� ����

   2. Complie
      1) file ���� directory �� �̵� �� compile ==> javac Ȯ��������FileName
         c:\work>javac Hello.java
      2) classFile ���� Ȯ�� ==> byte code ����Ȯ�� (Hello.class)
         c:\work>dir

   3. ����
      3) run ==> java Ȯ���ڸ� ������ FileName
         c:\work>java Hello
 
   << EditPlus ȯ�漳��: ������ , ���� ����ϱ� >>
   ==> ����/������ �������� ����� �� ����
*/