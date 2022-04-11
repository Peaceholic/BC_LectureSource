package prob3;
public class SmartPhone extends CellPhone
{
	private boolean isMonthlyFixedRate;
	private int monthlyFixedFee;
	
	public SmartPhone() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public SmartPhone(String phoneNumber, int feePerCallTime) {
		super(phoneNumber, feePerCallTime);
		// TODO Auto-generated constructor stub
	}	
	
	public SmartPhone(String phoneNumber, int feePerCallTime, boolean isMonthlyFixedRate, int monthlyFixedFee) {
		super(phoneNumber, feePerCallTime);
		this.isMonthlyFixedRate = isMonthlyFixedRate;
		this.monthlyFixedFee = monthlyFixedFee;
	}

	public boolean isMonthlyFixedRate() {
		return isMonthlyFixedRate;
	}

	public void setMonthlyFixedRate(boolean isMonthlyFixedRate) {
		this.isMonthlyFixedRate = isMonthlyFixedRate;
	}

	public int getMonthlyFixedFee() {
		return monthlyFixedFee;
	}

	public void setMonthlyFixedFee(int monthlyFixedFee) {
		this.monthlyFixedFee = monthlyFixedFee;
	}
	
	public void calculateTotalFee(){
		
		if(isMonthlyFixedRate()) {
			System.out.println("������ "+this.monthlyFixedFee+" ���� ����� �Դϴ�.");
			this.setFeePerCallTime(0);
			this.setTotalFee(this.monthlyFixedFee);
		}	
		
	}
}//end of class