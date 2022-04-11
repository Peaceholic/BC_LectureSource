package FileController;

import java.io.*;
import java.util.Stack;

public class FileController {

	public void reverseLine(String oldf, String newf) throws Exception {

		Stack<String> strS = new Stack<String>();

		BufferedReader br = new BufferedReader(new FileReader(oldf));
		BufferedWriter bw = new BufferedWriter(new FileWriter(newf));

		int readCount = 0;
		String strinS = null;

		while ((strinS = br.readLine()) != null) {
			strS.push(strinS);
			readCount++;
		}

		int outCount = 0;
		String strOutS = null;
		while (!(strS.empty())) {
			strOutS = strS.pop();
			bw.write(strOutS);
			bw.newLine();
			outCount++;
		}
		bw.flush();

		bw.close();
		br.close();

		System.out.println("read line Count : " + readCount);
		System.out.println("write line Count : " + outCount);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileController c = new FileController();
		String oldf = "./src/oldf.txt";
		String newf = "./src/newf.txt";

		try {
			c.reverseLine(oldf, newf);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
		} catch (Exception e) {
			e.printStackTrace();
		}
	}// end of main

}// end of class
