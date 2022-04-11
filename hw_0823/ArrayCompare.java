public class ArrayCompare
{
    //main method
    public static void main (String[] args)
    {
		int[] arr1 = {3, 5, 6, 9, 10, 2, 7};
		int[] arr2 = {3, 5, 6, 9, 10, 2, 7};
		if(equalsArr(arr1, arr2)){
			System.out.println("two array are equal");
		} else {
			System.out.println("two arrays are not equal");
		}

		System.out.println("======================");

		int[] arr3 = {3, 5, 6, 9};
		int[] arr4 = {3, 5, 6, 9, 8};
		if(equalsArr(arr3, arr4)){
			System.out.println("two arrays are equal");
		} else {
			System.out.println("two arrays are not - equal");
		}
	}
	
	private static boolean equalsArr(int[] arr1, int[] arr2){

		boolean result = false;
	
		if(arr1.length == arr2.length){

			for (int con=0; con < arr1.length; con++){
				if (arr1[con]==arr2[con])
					result = true;
				else 
					result = false;
				}
		} else {
			 result = false;
		}
			return result;
	}
}//end of class