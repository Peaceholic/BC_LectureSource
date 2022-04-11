package jb05.part03;

class TopSecret01{

	int secretNo = 7777;

	public TopSecret01(){
	}

	public int getSecretNo(){
		return secretNo;
	}
}

public class ModifierTest01{
	public static void main(String[] args){

		TopSecret01 topSecret = new TopSecret01();
		System.out.println(topSecret.secretNo);

		topSecret.secretNo = 1234;
		System.out.println(topSecret.getSecretNo());
	}
}