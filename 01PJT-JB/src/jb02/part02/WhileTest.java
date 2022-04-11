package jb02.part02;

/*
   FileName : WhileTest.java

   1. while(����)
   2. do..while(����)
   Ȱ�� �� �������� Ȯ��
*/

public class WhileTest {
	// main method
	public static void main(String[] args) {

		// while ��
		int i = 0; // #1. ��ȯ���� ������ �ֱ����� int i �ʱ�ȭ
		while (i < 10) { // #2. ���� (boolean data type)
			// while( 0 ) { //==> compile error (error�� Ȯ���ϸ�....)
			System.out.println("����� while�� ���ξ��� i = " + i);
			i++; // 3. ������
		}

		// do-while ��
		int j = 0; // #1. ��ȯ���� ������ �ֱ����� int j �ʱ�ȭ
		do {
			System.out.println("\n\t ����� do�� ���ξ���  = j" + j);
			j++; // #2. ������
		} while (j < 1); // #3. ���� (boolean data type)

		// while���� ���O�Ͽ� 5���� ����ϴ� ���α׷�
		int k = 1;
		while (k < 10) {
			System.out.println(" 5 * " + k + " = " + 5 * k);
			k++;
		}

		// ==> ���ѷ��� �� ���ѷ��� �Ĵ��� ���๮���� compile error ����
		while (true) {
			System.out.println("����� �ݺ��������� ���� ����");
		}

		// ==> �Ʒ��� �ּ��� Ǯ�� compile error�� �߻��Ѵ� ������...
		// System.out.println("error�� �߻��Ѵ� ������...");

	}// end of main

}// end of class