//import java.util.Vector;
import java.util.*;

public class ArrayCopy
{
	//�������̽� ����� ���� > ���� ������ Ÿ�� ������ ����
	//public Vector<String> moveToVector(String[] datas){
    public static List<String> moveToVector(String[] datas){

		//Vector<String> result = new Vector<String>();
		List<String> result = new Vector<String>();

		//int vec = 0;
		for (int arr = datas.length-1; arr >=0; arr--){
				
				//result.add(vec, datas[arr]);
				//vec++;
				result.add(datas[arr]);
		}
		return result;	
	}

    public static void main (String[] args)
    {
		ArrayCopy ac = new ArrayCopy();
		String datas[] = {"1", "2", "3", "4", "5"};
		System.out.println(moveToVector(datas));
		
    }//end of main  

}//end of class