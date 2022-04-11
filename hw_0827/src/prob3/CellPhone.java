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

	// 생략시 하위클레스 생성자 에러 확인
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
		System.out.println(number+" 번호로 "+time+" 통화함.");
		this.totalCallTime+=time;		
	}
	
	public void calculateTotalFee(){
		totalFee = this.totalCallTime*this.feePerCallTime;		
	}
	
	


   
}//end of class