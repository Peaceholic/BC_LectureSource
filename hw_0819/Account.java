public class  Account
{
	String accName;
	int balanceData;
	
		// 생성자
		public Account(String name){
        	accName = name;
			balanceData = 0;
			System.out.println(accName+" 계좌가 개설되었습니다.");
		}

	   // 입금
		public int save(int money){
			System.out.println(accName+" 계좌에 "+money+"만원이 입금되었습니다.");
			balanceData+=money;
			return balanceData; 
		}

	   // 출금
		public int deposit (int money){
			System.out.println(accName+" 계좌에 "+money+"만원이 출금되었습니다.");
			balanceData-=money;
			return balanceData; 
		}

		// 잔고확인 
		public int getAccBalance(){
			return this.balanceData; 
		}

		// 계좌 확인 
		public String getAccNo(){
			return this.accName; 
		}	


    public static void main(String[] args) throws Exception 
	{
		String accNo = null;
		int balance = 0;

		Account accObj = new Account("078-3762-293");
	    accNo = accObj.getAccNo();
		balance = accObj.getAccBalance();
		System.out.println(accNo + " 계좌의 잔고는 " +balance+ "만원 입니다");

		accObj.save(100);
		balance = accObj.getAccBalance();
		System.out.println(accObj.getAccNo() + " 계좌의 잔고는 " +balance+ "만원 입니다");

		accObj.deposit(30);
		balance = accObj.getAccBalance();
		System.out.println(accNo + " 계좌의 잔고는 " +balance+ "만원 입니다");
	}

}