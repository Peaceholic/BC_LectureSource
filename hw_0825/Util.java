public class Util
{
	//���ڷ� ���� limit������ �Ҽ� ������ return �ϴ� Method
	public int findPrimeCount(int limit){
		//����
		int total = 0;
				
		if (limit <= 1){
			System.out.println("1���� ū ������ �Է��ϼ���.");
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
		//����
		int[] arrayResult = new int[this.findPrimeCount(limit)];
	
		if (limit <= 1){
			System.out.println("1���� ū ������ �Է��ϼ���.");
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