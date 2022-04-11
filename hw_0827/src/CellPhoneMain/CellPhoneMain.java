package CellPhoneMain;

public class CellPhoneMain
{
    public static void main (String[] args)
    {
		CellPhone myPhone = new CellPhone("SCH-600");

		myPhone.charge(20);         //20�� ����
		myPhone.printBattery();
		
		myPhone.call(300);            //300�� ��ȭ
		myPhone.printBattery();

		myPhone.charge(50);        //50�� ����
		myPhone.printBattery();
				
		myPhone.call(40);             //40�� ��ȭ
		myPhone.printBattery();

		try{
			myPhone.call(-20);       // ��ȭ�ð��� �߸��ԷµǾ����ϴ�.
		}catch(IllegalArgumentException e){
			System.out.println(e.getMessage());
		}

		CellPhone yourPhone = new CellPhone("SCH-600");

		if(myPhone.equals(yourPhone)){
				System.out.println("���� ���Դϴ�.");	
		} else {
				System.out.println("�ٸ� ���Դϴ�");	
		}	
	
	}//end of main

}//end of class