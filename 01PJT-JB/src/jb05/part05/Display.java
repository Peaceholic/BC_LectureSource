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
		System.out.println("버스요금안내");
	}

//==> 사용되지 않으며, 하위 클래스에 OverRiding을 강제하는 추상 메서드 정의
// public void charge() {
//     System.out.println("학생:300, 일반인: 500, 어르신: 공짜");
//}
	public abstract void charge();
}// end of class


	class Student extends BusCharge{
		public Student() {
			super("학생");
	}
	public void charge() {
		System.out.println("300원");
	}
}// end of class
	class Adult extends BusCharge{
		public Adult(){
			super("일반인");
		}
		public void charge() {
			System.out.println("500원");
		}
	}// end of class


class Old extends BusCharge{
	public Old(){
		super("어르신");
	}
	public void charge() {
		System.out.println("공짜");
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