package jp02.part05;

/*<< Inner local Class의 이해>>
1. inner localClass는 method 와 내부의 local variable 과 같은 level
2. 컴파일후 innerClass는 어떤 형태의 class 가 되는지 확인할 것 (~~~$1~~~.class)
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
        final String localVariable = "OuterClass 내의 outerMethod 의 localVariable";

        //Inner local Class
        class InnerLocalClass{

            //Field
            private String inner = "innerClass 의 Field";

            //Constructor
            public InnerLocalClass(){
            }

            //Method
            public void innerMethod(){
                System.out.println("==> "+this.getClass().getName()+" start..");

            //innerClass 에서 OuterClass로 접근
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

		
        //inner local class 률 둘러싼 method 에서 인스턴스 생성가능
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