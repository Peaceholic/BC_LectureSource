package Prob1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;

public class Prob1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Prob1 e = new Prob1();
		Vector<String> scores = e.getList();
		for (String x : scores) {
			System.out.println(x);
		}
	}// end of main

	public Vector<String> getList() {

		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("./src/Prob1/list.txt"));
		} catch (FileNotFoundException e2) {
			e2.printStackTrace();
		}
		StringBuilder sb = new StringBuilder();

		String str = null;
		Vector<String> strV = new Vector<String>();

		try {
			while ((str = br.readLine()) != null) {

				String[] strArr = str.split("/");
				String course = strArr[1];
				String result = "미수료";

				int score = Integer.parseInt(strArr[2]);
				if (course.equalsIgnoreCase("java")) {
					if (score >= 80) {
						result = "수료";
					}
				}
				if (course.equalsIgnoreCase("sql")) {
					if (score >= 90) {
						result = "수료";
					}
				}
				sb.append("[" + strArr[0] + ", " + strArr[1] + ", " + strArr[2] + ", " + result + "]"); // final String
			}
			strV.add(sb.toString()); // Vector에 저장

		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (Exception e1) {
			e1.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		return strV;
	}// end of getList

}// end of class
