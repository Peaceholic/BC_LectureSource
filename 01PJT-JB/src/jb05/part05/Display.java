package jb05.part05;

abstract class BusCharge{
	///Field
	String section;
	///Constructor
	public BusCharge() {
	}
	public BusCharge(String section) {
		this.section = section;
	}
	///method
	public void information() {
		System.out.println("������ݾȳ�");
	}

//==> ������ ������, ���� Ŭ������ OverRiding�� �����ϴ� �߻� �޼��� ����
// public void charge() {
//     System.out.println("�л�:300, �Ϲ���: 500, ���: ��¥");
//}
	public abstract void charge();
}// end of class


	class Student extends BusCharge{
		public Student() {
			super("�л�");
	}
	public void charge() {
		System.out.println("300��");
	}
}// end of class
	class Adult extends BusCharge{
		public Adult(){
			super("�Ϲ���");
		}
		public void charge() {
			System.out.println("500��");
		}
	}// end of class


class Old extends BusCharge{
	public Old(){
		super("���");
	}
	public void charge() {
		System.out.println("��¥");
	}
}// end of class


public class Display{

	///main method
	public static void main(String args[]){

		BusCharge bc1 = new Student();
		BusCharge bc2 = new Adult();
		BusCharge bc3 = new Old();

		bc1.information(); 
		System.out.print(bc1.section);
		bc1.charge();

		bc2.information();
		System.out.print(bc2.section);
		bc2.charge();

		bc3.information();
		System.out.print(bc3.section);
		bc3.charge();

	}//end of main
}// end of class