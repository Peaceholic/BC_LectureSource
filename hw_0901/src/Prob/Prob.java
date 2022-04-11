package Prob;

import java.util.Vector;
import java.io.*;

public class Prob {

	public static void main(String[] args) throws Exception {
		Prob p = new Prob();
		Vector<Score> scores = p.getScore("./src/Prob/data.txt");

		for (int i = 0; i < scores.size(); i++) {
			Score score = (Score) scores.get(i);
			System.out.println(score.getName() + " : " + score.getKor() + " " + score.getEng() + " " + score.getMath()
					+ " " + score.getSum());
		}
	}

	public Vector<Score> getScore(String fileName) throws Exception {
		
		BufferedReader br = new BufferedReader(new FileReader(fileName));
		Vector<Score> scoreV = new Vector<Score>();

		String tempLine ="";
		String[] tempArr = null;
		String tempName = "";
		int tempKor = 0;
		int tempEng = 0;
		int tempMath = 0;
		int tempSum = 0;
		
		while ((tempLine = br.readLine()) != null) {			
			tempArr = tempLine.split("/");						
			tempName = tempArr[0];
			tempKor = Integer.parseInt(tempArr[1]);
			tempEng = Integer.parseInt(tempArr[2]);
			tempMath = Integer.parseInt(tempArr[3]);
			tempSum = tempKor + tempEng + tempMath;
            
			Score so = new Score();
			so.setName(tempName);
			so.setKor(tempKor);
			so.setEng(tempEng);
			so.setMath(tempMath);
			so.setSum(tempSum);
			scoreV.add(so);			
		}
		br.close();

		return scoreV;
	}
}

class Score {
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int sum;

	public Score() {
	}

	public Score(String name, int kor, int eng, int math, int sum) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.sum = sum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}
}
