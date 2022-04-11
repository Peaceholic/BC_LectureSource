package Prob2;

import java.io.*;
import java.util.Random;

public class Prob2 {

	public static void main(String[] args) {
		int[] array = generateRandomNumber();
		try {
			printStatistics(array);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}// end of main

	// 10���� �ߺ����� �ʴ� ������ �����Ͽ� �迭�� �������� ����
	private static int[] generateRandomNumber() {

		Random random = new Random();
		int[] ir = new int[10];

		for (int i = 0; i < ir.length; i++) {
			ir[i] = random.nextInt(21);
		}
		return ir;
	}

	// 10���� ���� �迭�� �Ű������� �Ͽ� �߻��� ������ ��������� store.txt ���Ͽ� ���
	private static void printStatistics(int[] array) throws IOException {

		BufferedWriter bw = null;
		int lineCount = 0;

		bw = new BufferedWriter(new FileWriter("./src/Prob2/store.txt"));

		for (Integer nums : array) {
			System.out.println("ranArr : " + nums.toString());
			try {
				bw.write(nums.toString());
				bw.newLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		for (Integer sets : findsets(array)) {
			lineCount++;
			System.out.println("setArr : " + sets.toString());
			try {
				if (lineCount != 3) {
					bw.write(sets.toString());
					bw.newLine();
				} else {
					bw.write(sets.toString());
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		bw.flush();
		if (bw != null) {
			bw.close();
		}

	}

	private static int[] findsets(int[] array) {

		int[] set = new int[3];
		int max = 0;
		int min = 0;
		int sum = 0;
		int count = 0;

		for (int x : array) {
			count++;
			sum += x;
			if (x >= max) {
				max = x;
			}
			if (count == 1) {
				min = x;
			} else {
				if (x <= min) {
					min = x;
				}
			}
		}
		set[0] = max;
		set[1] = min;
		set[2] = sum / count;

		return set;
	}

}// end of class
