public class StringUtil
{
	public static void main(String[] args){
		
		String[] arr = {"java program", "array", "java program area", "append"};
		String result = StringUtil.replaceString(arr);
		System.out.println("변경된 문자열 : "+result);	
	
	}//end of main

	// 가장 많은 a를 가진 문자열을 찾아서 a > A 로 변경 후 리턴
	public static String replaceString(String[] arr){

		int arrTop = 0;
		int aTop = 0;		

		for (int i=0; i<arr.length; i++){

			String temp ="";
			int aCount = 0;	

			for (int j=0; j<arr[i].length(); j++){							
				if (arr[i].charAt(j) != 'a'){
					temp+=Character.toString(arr[i].charAt(j));										
				} else {
					temp+=Character.toString('A');
					aCount++;					
				}

				if(aCount >= aTop){
					aTop = aCount;
					arrTop = i;
				}
			}
			arr[i] = temp;
		}

		/* test print block
		System.out.println("arrTop : "+arrTop);
		System.out.println("aTop : "+aTop);
		for (String str : arr){
			System.out.println("arr : "+str);
		}
		*/

		return arr[arrTop];
	}	

}//end of class