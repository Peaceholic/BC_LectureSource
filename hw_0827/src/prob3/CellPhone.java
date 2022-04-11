package prob3;
public class CellPhone
{
	private String phoneNumber;
	private int totalCallTime;
	private int totalFee;
	private int feePerCallTime;

	public CellPhone(){		
	}

	public CellPhone(String phoneNumber){
		this.phoneNumber = phoneNumber;
	}		

	// ������ ����Ŭ���� ������ ���� Ȯ��
	public CellPhone(String phoneNumber, int feePerCallTime){
		this.phoneNumber = phoneNumber;
		this.feePerCallTime = feePerCallTime;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getTotalCallTime() {
		return totalCallTime;
	}

	public void setTotalCallTime(int totalCallTime) {
		this.totalCallTime = totalCallTime;
	}

	public int getTotalFee() {
		return totalFee;
	}

	public void setTotalFee(int totalFee) {
		this.totalFee = totalFee;
	}

	public int getfeePerCallTime() {
		return feePerCallTime;
	}

	public void setFeePerCallTime(int feePerCallTime) {
		this.feePerCallTime = feePerCallTime;
	}
	
	public void call(String number, int time){
		System.out.println(number+" ��ȣ�� "+time+" ��ȭ��.");
		this.totalCallTime+=time;		
	}
	
	public void calculateTotalFee(){
		totalFee = this.totalCallTime*this.feePerCallTime;		
	}
	
	


   
}//end of class