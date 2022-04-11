package jb05.part04;

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

		Student b1 = new Student();
		Adult b2 = new Adult();
		Old b3 = new Old();

		b1.information(); 
		System.out.print(b1.section);
		b1.charge();// 어떤 클래스의 Method 호출 됐는지 확인

		b2.information();
		System.out.print(b2.section);
		b2.charge();// 어떤 클래스의 Method 호출 됐는지 확인

		b3.information();
		System.out.print(b3.section);
		b3.charge();// 어떤 클래스의 Method 호출 됐는지 확인

	}//end of main
}// end of class