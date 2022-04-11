package FileCalculator;

import java.io.*;
import java.util.Vector;

public class FileCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileCalculator fc = new FileCalculator();

		try {
			fc.addCalculateResult("./src/test.txt");

		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void addCalculateResult(String inputFileName) throws Exception {

		BufferedReader br = new BufferedReader(new FileReader(inputFileName));
		BufferedWriter bw = new BufferedWriter(new FileWriter("./src/test_out.txt"));

		int readCount = 0;
		Vector<Integer> intV = new Vector<Integer>();

		while ((br.readLine()) != null) {
			intV.add(Integer.parseInt(br.readLine()));
			readCount++;
		}

		int sum = 0;
		int multiply = 1;
		for (Integer s : intV) {
			sum += s;
			multiply *= s;
		}
		intV.add(readCount, sum);
		intV.add(readCount + 1, multiply);

		for (Integer s : intV) {
			System.out.println(s);
		}

		for (Integer s : intV) {
			bw.write(s.toString());
			bw.newLine();
		}
		bw.flush();

		bw.close();
		br.close();

	}

}
