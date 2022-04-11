public class Util
{
	//인자로 받은 limit까지의 소수 갯수를 return 하는 Method
	public int findPrimeCount(int limit){
		//구현
		int total = 0;
				
		if (limit <= 1){
			System.out.println("1보다 큰 정수를 입력하세요.");
		} else {			
			for (int num=2; num <= limit; num++)
			{
				 for (int i=2; i <= num; i++) {
					if (num % i == 0 && i != num) { 
						break;
					}
					if (num % i ==0 && i == num) { 
						total++;
					}
				}
			}        
		}
		return total;			
	}// end of findPrimeCount	

	public int[] findPrimeReturnArray(int limit){		
		//구현
		int[] arrayResult = new int[this.findPrimeCount(limit)];
	
		if (limit <= 1){
			System.out.println("1보다 큰 정수를 입력하세요.");
		} else {			
			int arrayIndex = 0;			
			for (int num=2; num <= limit; num++)
			{
				 for (int i=2; i <= num; i++) {
					if (num % i == 0 && i != num) { 
						break;
					}
					if (num % i ==0 && i == num) { 
						arrayResult[arrayIndex] = i;
						arrayIndex++;
					}
				}
			}        
		}		
		return arrayResult;	
	}//end of findPrimeReturnArray

}//end of util class