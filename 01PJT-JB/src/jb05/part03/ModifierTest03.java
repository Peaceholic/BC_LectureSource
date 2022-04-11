package jb05.part03;

final class TopSecret03{
	
	private final int secretNo = 7777;

	public TopSecret03(){
	}

	public int getSecretNo(int pwd){
		
		if (pwd==0){
			return secretNo;
		}else{
		    return 0;
		}
	}	

	public static TopSecret03 getInstance(){
		TopSecret03 topSecret = new TopSecret03();
		return topSecret;
	}
}

public class ModifierTest03{
	public static void main(String[] args){
		TopSecret03 topSecret =TopSecret03.getInstance();

		System.out.println(topSecret.getSecretNo(0));
	}	
}