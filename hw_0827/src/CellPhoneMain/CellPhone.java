package CellPhoneMain;

public class CellPhone {
	private String model;
	private double battery;
	
	public CellPhone() {		
	}
	
	public CellPhone(String model) {
		this.model = model;
	}
	
	public void call(int time) {
		
		if( time <= 0) {
			throw new IllegalArgumentException("통화시간 입력오류");
		} else {
			this.battery -=(time * 0.5);
		}
		if(this.battery < 0) {
			this.battery = 0;
		}
		
		System.out.println("통화시간 : "+time+" 분");
			
	}
	
	public void charge(int time) {
		
		if( time <= 0) {
			throw new IllegalArgumentException("충전시간 입력오류");
		} else {
			this.battery+=(time * 3);
		}
		
		if(this.battery > 100) {
			this.battery = 100;
		}
		
		if(this.battery < 0) {
			this.battery = 0;
		}
		System.out.println("충전시간 : "+time+" 분");
			
	}
	
	public void printBattery() {
		System.out.println("남은 배터리 양 : "+battery);
	}
	
	public boolean equals(Object obj) {
		
		if(obj == null) {
			return false;			
		} else if( !(obj instanceof CellPhone)){
			return false;			
		} else {
			CellPhone otherPhone = (CellPhone)obj;
			return this.model.equals(otherPhone.model);
		}
		
		/*
		String a = this.model;
		String b = phone.model;
		return a.equals(b);
		*/
		
	}

}
