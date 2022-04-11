public class SortUtil
{
     public int[] ascending(int[] inputNumbers){
	    
		//여기에 구현
		int temp=0;

		for(int i=0; i < inputNumbers.length; i++){
		  for(int j = i+1; j < inputNumbers.length; j++){

			  if (inputNumbers[i] > inputNumbers[j]){
				  
				  temp = inputNumbers[i];
				  inputNumbers[i] = inputNumbers[j];
				  inputNumbers[j] = temp;
			  }
		  }
	 }	 
	    return inputNumbers;
	 }

    //main method
    public static void main (String[] args)
    {
    
	SortUtil util = new SortUtil();
	int[] numbers = new int[] {7, 5, 2, 19, 34, 51, 32, 11, 67, 21};
	
    numbers = util.ascending(numbers);

	 for(int i=0; i < numbers.length; i++){
		 System.out.print(numbers[i]);

		 if( i != numbers.length-1){
			 System.out.print(", ");		 
		 } else{
		     System.out.println("");	
		 }
	 }
	 System.out.println("Successful !!!");
    }//end of main  
}//end of class

     /*
	 for(int i=0; i < array.length; i++){
		  for(int j = i+1; j < array.length; j++){

			  if (array[i] > array[j]){
				  
				  temp = array[i];
				  array[i] = array[j];
				  array[j] = temp;
			  }
		  }
	 }

	 for(int i=0; i < array.length-1; i++){
		 System.out.print(array[i]+ ", ");		
	 }
	 System.out.print(array[array.length-1]);
	 */