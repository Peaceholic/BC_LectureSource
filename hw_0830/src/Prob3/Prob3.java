package Prob3;

import java.util.Vector;

public class Prob3 {

	/// Field
	/// Constructor
	/// Method
	public Vector<String> dataChange(String[] strData) {

		// ±¸Çö
		Vector<String> tempV = new Vector<String>();
		String tempStr = "";

		for (String str : strData) {

			tempStr = "";
			for (int r = str.length() - 1; r >= 0; r--) {
				tempStr += str.charAt(r);
			}
			tempV.add(0, tempStr);
		}

		return tempV;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Prob3 st = new Prob3();
		String[] strData = { "Java Programming", "JDBC", "Oracle 10g", "JSP/Servlet" };
		Vector<String> v = st.dataChange(strData);

		for (int i = 0; i < v.size(); i++) {
			System.out.println(v.elementAt(i));
		}
	}// end of main
}// end of class
