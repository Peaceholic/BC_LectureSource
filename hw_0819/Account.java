public class  Account
{
	String accName;
	int balanceData;
	
		// ������
		public Account(String name){
        	accName = name;
			balanceData = 0;
			System.out.println(accName+" ���°� �����Ǿ����ϴ�.");
		}

	   // �Ա�
		public int save(int money){
			System.out.println(accName+" ���¿� "+money+"������ �ԱݵǾ����ϴ�.");
			balanceData+=money;
			return balanceData; 
		}

	   // ���
		public int deposit (int money){
			System.out.println(accName+" ���¿� "+money+"������ ��ݵǾ����ϴ�.");
			balanceData-=money;
			return balanceData; 
		}

		// �ܰ�Ȯ�� 
		public int getAccBalance(){
			return this.balanceData; 
		}

		// ���� Ȯ�� 
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
		System.out.println(accNo + " ������ �ܰ�� " +balance+ "���� �Դϴ�");

		accObj.save(100);
		balance = accObj.getAccBalance();
		System.out.println(accObj.getAccNo() + " ������ �ܰ�� " +balance+ "���� �Դϴ�");

		accObj.deposit(30);
		balance = accObj.getAccBalance();
		System.out.println(accNo + " ������ �ܰ�� " +balance+ "���� �Դϴ�");
	}

}