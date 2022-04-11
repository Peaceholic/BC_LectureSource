import java.util.Scanner;

public class Prob03
{
    //main method
    public static void main (String[] args)
    {
    
	int[] array = {3, 24, 1, 55, 17, 43, 5};
	int temp =0;

     // 아래에 구현하세요
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

    }//end of main  
}//end of class