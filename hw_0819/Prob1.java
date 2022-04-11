public class  Prob1
{
	public static void main(String[] args) 
	{

		int largest = 0;
		int smallest = 10000;
		int sum = 0;
		double average = 0.0;

		//Array 사용/미사용
		int[] array = new int[args.length];

		//여기에 구현
		for(int con =0; con < args.length; con++){
			array[con]= Integer.parseInt(args[con]);		
		}

		int temp =0;

		for(int con1 =0; con1 < array.length; con1++){
			for(int con2 =con1+1; con2 < array.length; con2++){

				if(array[con1] > array[con2]){
					temp =  array[con1];
					array[con1] = array[con2];
					array[con2] = temp;
				}
			}
		}

		// test 후 제거
		System.out.println("test2- array 정렬 결과"); 
		for(int i=0; i < array.length; i++){ 
			  System.out.print(array[i]);
  		      System.out.print( i != array.length-1 ? ", " : "");
		 }
		 System.out.println(); 

		largest = array[array.length-1];
		smallest = array[0];

		for(int con =0; con < array.length; con++){
			sum+= array[con];
		}

		average = ((double)sum)/array.length;
		
		System.out.println(); // test 후 제거
		
		System.out.println("the largest value = " +largest);
		System.out.println("the smallest value = " +smallest);
		System.out.println("the total value = " +sum);
		System.out.println("and the average is = " +average);
	}
}
