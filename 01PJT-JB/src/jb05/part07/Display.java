package jb05.part07;

/*
		FileName : Display.java

				<<< interface >>>
				: abstract method ���� (��ɸ� ������ class / pure abstract class)
				 ���(methdo)�� ���� ����(����)  class���� O/R ����
				: �ν��Ͻ� ���� �Ұ� (�߻� Ŭ������ �ν��Ͻ� �����Ұ��� ���� �ǹ�)
				SPEC.�� ��� ����� ������ ���̸�,
				������ �����  SPEC.�� ������ ����ü(���� ��ü)�� ���
*/
class BusCharge{
	/// Field
	String section;
	/// Constructor
	public BusCharge(){
	}
	public BusCharge(String section){
		this.section=section;
	}
	/// method
	public void information(){
		System.out.println("������ݾȳ�");
	}
} // end of class


// charge()�� ������ interface
// �� ����� ����(��ɸ� �����Ͽ� �����Ѵٸ�...) : ����ö, �װ�, �ý� ��ݿ��� ��� ����
interface Fee{
	public void charge();
} // end of class


// interface ������ abstract method ���� ������(OverRiding) �ؾ��� �� ������
class Student extends BusCharge implements Fee{
	public Student(){
		super("�л�");
	}
	// �� �Ʒ���  Method�� �ּ�ó���ϰ� ������. ������ ������ Ȯ������
	public void charge() {
		System.out.println("300��");
	}
} // end of class

// interface ������ abstract method ���� ������(OverRiding) �ؾ��� �� ������
class Adult extends BusCharge implements Fee{
	public Adult(){
		super("�Ϲ���");
	}
	public void charge() {
		System.out.println("500��");
	}
} // end of class

// interface ������ abstract method ���� ������(OverRiding) �ؾ��� �� ������
class Old extends BusCharge implements Fee{
	public Old(){
		super("���");
	}
	public void charge() {
		System.out.println("��¥");
	}
} // end of class


public class Display{
	/// main method
	public static void main(String args[]){
///* <<����1>> �Ʒ��� ������ ���� ���� ���
		Student bc1 = new Student();
		Adult bc2 = new Adult();
		Old bc3 = new Old();

		bc1.information();
		System.out.print(bc1.section);
		bc1.charge();

		bc2.information();
		System.out.print(bc2.section);
		bc2.charge();

		bc3.information();
		System.out.print(bc3.section);
		bc3.charge();
//*/

/* << ���� 2 >> �Ʒ��� �������� ���� �߻� : �����Ͻ� ����
			// 1. ������ �߻��� ����
			// 2. ������ �ذ��Ͽ� ����� �� �� �ֵ��� ������ ������ ��
			// �� ��Ʈ : CastingComplete.java�� ����°�� �������� (casting �����ڸ� ����� ������?)

			Fee [] fee = new fee[3];
			fee[0] = new Student();
			fee[1] = new Adult();
			fee[2] = new Old();

			for( int i=0 ; i<fee.length ; i++ ){
				fee[i].information();
				System.out.print(fee[i].section);
				fee[i].charge();
			}
*/
	} // end of main
} // end of class