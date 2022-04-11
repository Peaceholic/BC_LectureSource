package jb04.part01;

public class Bank02{

	///Field
	int balance;
	int money;
	static int command;
	String bankName;
	String userName;

	/// Constructor
	public Bank02(){
	}
	public Bank02(String[] str){
		userName = str[0];
		bankName = str[1];
		command = Integer.parseInt(str[2]);
		money = Integer.parseInt(str[3]);
	}

	///method
	public void work(){
		if(command ==1){
			deposit();
		}else if(command==2){
			withdrawal();
		}
	}
	//==> 입금을 수행 method
	public void deposit(){
		balance += money;
		System.out.println(money+"원 입금함.");
	}
	//==> 출금은 수행 method
	public void withdrawal() {
		balance -= money;
		System.out.println(money+"원 출금함.");
	}

	public void displayMoney(){
		System.out.println("현재 금액은: " + balance+"입니다.");
	}


	/// getter/setter method 생략

	/// main method
	public static void main(String [] args) {
		if(!(args.length==2||args.length==4) ){
			System.out.println("[usage]:: java Bank02 [customerName][bankName][option][money]");
			System.out.println("[usage]:: 인자값이 2,4개가 필요합니다.");
			System.exit(0);
		}
		System.out.println(args[0]+"님의 주거래은행은 " +args[1]+"입니다.");

		Bank02 b = new Bank02();

		if(command !=1 && command !=2) {
			System.out.println("[usage]:: java Bank02 [customerName][bankName][option][money]");
			System.out.println("[usage]:: option을 확인하세요 :: 1 => 입금, 2==> 출금");
			return;
		}

		// String Array 인자 받는 생성자를 이용한 인스턴스 생성
		b = new Bank02(args);

		// 입금, 출금을 판단 각각의 method를 호출하는 method 호출
		b.work();
		
		// 잔액을 표시하는 method 호출
		b.displayMoney();
	}	

}// end of main
