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
			throw new IllegalArgumentException("��ȭ�ð� �Է¿���");
		} else {
			this.battery -=(time * 0.5);
		}
		if(this.battery < 0) {
			this.battery = 0;
		}
		
		System.out.println("��ȭ�ð� : "+time+" ��");
			
	}
	
	public void charge(int time) {
		
		if( time <= 0) {
			throw new IllegalArgumentException("�����ð� �Է¿���");
		} else {
			this.battery+=(time * 3);
		}
		
		if(this.battery > 100) {
			this.battery = 100;
		}
		
		if(this.battery < 0) {
			this.battery = 0;
		}
		System.out.println("�����ð� : "+time+" ��");
			
	}
	
	public void printBattery() {
		System.out.println("���� ���͸� �� : "+battery);
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
