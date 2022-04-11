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
	//==> �Ա��� ���� method
	public void deposit(){
		balance += money;
		System.out.println(money+"�� �Ա���.");
	}
	//==> ����� ���� method
	public void withdrawal() {
		balance -= money;
		System.out.println(money+"�� �����.");
	}

	public void displayMoney(){
		System.out.println("���� �ݾ���: " + balance+"�Դϴ�.");
	}


	/// getter/setter method ����

	/// main method
	public static void main(String [] args) {
		if(!(args.length==2||args.length==4) ){
			System.out.println("[usage]:: java Bank02 [customerName][bankName][option][money]");
			System.out.println("[usage]:: ���ڰ��� 2,4���� �ʿ��մϴ�.");
			System.exit(0);
		}
		System.out.println(args[0]+"���� �ְŷ������� " +args[1]+"�Դϴ�.");

		Bank02 b = new Bank02();

		if(command !=1 && command !=2) {
			System.out.println("[usage]:: java Bank02 [customerName][bankName][option][money]");
			System.out.println("[usage]:: option�� Ȯ���ϼ��� :: 1 => �Ա�, 2==> ���");
			return;
		}

		// String Array ���� �޴� �����ڸ� �̿��� �ν��Ͻ� ����
		b = new Bank02(args);

		// �Ա�, ����� �Ǵ� ������ method�� ȣ���ϴ� method ȣ��
		b.work();
		
		// �ܾ��� ǥ���ϴ� method ȣ��
		b.displayMoney();
	}	

}// end of main