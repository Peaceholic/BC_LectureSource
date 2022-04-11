package jb03.part04;

public class MethodSyntaxTestApp
{	
	public static void main(String[] arg)
	{
		MethodSyntax methodSyntax = new MethodSyntax();

		System.out.println("\n ====================");
		methodSyntax.browerOn();
    
		System.out.println("\n ====================");
		boolean result = methodSyntax.documentWork();
    	System.out.println("doc 작업유무 : "+result);

		System.out.println("\n ====================");
		int value = methodSyntax.sum(1, 1);
    	System.out.println("계산 결과 : "+value);
        // System.out.println("계산 결과 : "+methodSyntax.sum(1, 1));

		System.out.println("\n ====================");
		String name = methodSyntax.getName();
    	System.out.println("Field 정보 name : "+name);
        System.out.println("Field 정보 name : "+methodSyntax.getName());

        System.out.println("\n ====================");
		String add = methodSyntax.getAdd();
    	System.out.println("Field 정보 add : "+add);
        System.out.println("Field 정보 add : "+methodSyntax.getAdd());

        System.out.println("\n ====================");
        String[] info = methodSyntax.getAllinformation();
        System.out.println("Field 정보 모두출력");

        for(int i = 0; i < info.length ; i++){
        //for(int i = 0; i < 2; i++){ //<== info.length 의 사용과 2의 차이점
        System.out.println( (i+1) + " 번째 정보 : "+info[i]);
        }		
	}   
}