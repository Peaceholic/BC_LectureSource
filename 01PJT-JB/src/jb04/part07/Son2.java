package jb04.part07;
//outer

// son, father는 같은패키지, 상속관계
// 주석풀고 컴파일에러확인


public class Son2 extends Father 
{
	public Son2(){
	
       	System.out.println(this.name);    
        // public String name = "홍길동";       // public    - 누구나 접근가능
		
        System.out.println(bank);         
        // protected String bank = "한양은행";  // protected - 상속관계, 같은 package 접근가능
        
        System.out.println(branch);       
        // String branch = "역삼동지점";        // (       ) - 같은 package 접근가능

		//System.out.println(password);     
        // private int password = 1234;         // private   - 자신만 접근가능   
        
        System.out.println("은행 비번: "+this.getPassword(0));
	}
}