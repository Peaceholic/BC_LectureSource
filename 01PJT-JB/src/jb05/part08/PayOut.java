package jb05.part08;

/*
		FileName : Deposit.java

			1. 금융업무를 하는 곳이라면 출금업무(기능)는 필수 기능
			2. 은행, 금고, 증권 등 어느곳이나 공통된 업무인 출금업무(기능)를 interface 정의
*/
public interface PayOut{

	// interface Field (member variable) → public static final 특성을 갖는다.
	public final static String payOut = "출금";

	// interface method → public abstract final 특성을 갖는다.
	public abstract void payOut(int money);

} // end of class