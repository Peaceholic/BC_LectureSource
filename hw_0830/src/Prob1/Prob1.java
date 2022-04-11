package Prob1;

public class Prob1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int input = Integer.parseInt(args[0]);

		int starCount = 1;
		for (int col = 1; col <= input; col++) {
			for (int space = input - col; space >= 0; space--) {
				System.out.print(" ");
			}
			for (int star = 0; star < starCount; star++) {
				System.out.print("*");
			}

			System.out.println("");
			starCount += 2;
		}
	}
}// end of main
