package jp02.part05;

/*<< Inner local Class�� ����>>
1. inner localClass�� method �� ������ local variable �� ���� level
2. �������� innerClass�� � ������ class �� �Ǵ��� Ȯ���� �� (~~~$1~~~.class)
*/

public class OuterClass02{
    
    //Field
    private String outer = "outerClass o Field";

    //Constructor
    public OuterClass02(){
    }

    //Method
    public void outerMethod(){
        System.out.println(":: "+this.getClass().getName()+" start..");
        final String localVariable = "OuterClass ���� outerMethod �� localVariable";

        //Inner local Class
        class InnerLocalClass{

            //Field
            private String inner = "innerClass �� Field";

            //Constructor
            public InnerLocalClass(){
            }

            //Method
            public void innerMethod(){
                System.out.println("==> "+this.getClass().getName()+" start..");

            //innerClass ���� OuterClass�� ����
            System.out.println(localVariable);
            System.out.println(outer);
            System.out.println(inner);
            System.out.println("==> "+this.getClass().getName()+" end..");
            }
        }
        System.out.println(":: "+this.getClass().getName()+" start.");

		// inner - inner
		class InnerLocalClassed1{
			private int a = 666;

			public InnerLocalClassed1(){
			}
		}

		
        //inner local class �� �ѷ��� method ���� �ν��Ͻ� ��������
        InnerLocalClass ilc = new InnerLocalClass();
        ilc.innerMethod();
    }

	//inner
	public void outerMethoded(){
		class InnerLocalClassed{
			private int a = 666;

			public InnerLocalClassed(){
			}
		}
	}

    //main method
    public static void main(String[] args){
        new OuterClass02(). outerMethod();
    }
}