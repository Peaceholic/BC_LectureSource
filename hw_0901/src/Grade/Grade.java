package Grade;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Grade grade = new Grade();
		String fileName = "./src/Grade/score.txt";
		try {
			grade.printGrade(fileName);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void printGrade(String fileName) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new FileReader(fileName));

		int readCount = 0;
		String str = null;
		int tempInt = 0;
		int sum = 0;
		int avg = 0;

		while ((str = br.readLine()) != null) {
			readCount++;
			String[] strArr = str.split(",");
			tempInt = Integer.parseInt(strArr[1]);
			sum += tempInt;
			avg = sum/readCount;
			System.out.println(strArr[0] + "�� ������ " + tempInt + "�� �Դϴ�.");
		}		
		br.close();
		
		System.out.println("");
		System.out.println("����� ������ "+sum+"�� �Դϴ�.");
		System.out.println("����� ������ "+avg+"�� �Դϴ�.");
		
		System.out.println("");		
		System.out.println("������ �� : "+readCount);
		
	}
}