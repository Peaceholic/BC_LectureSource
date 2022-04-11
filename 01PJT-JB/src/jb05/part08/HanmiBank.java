package jb05.part08;

// bank, deposit, payout class�� �̿��Ͽ� hanmibank�� ����
// bank, deposit, payout �� ����࿡���� ���� �� �ִ�
// deposit, payout �� ��������̸� ��𼭳� ��� �� �� �մ� ����� ������ class
//   (��������� �ݵ�� ��/�� �� ����� ���� 


public class HanmiBank extends Bank implements Deposit, PayOut 
{
    //field

    //constructor
    public HanmiBank(){
    }

    public HanmiBank(String name){
        super(name);
    }

    //method
    public void display(){
        System.out.println("�����: "+ this.getName());
    }

    public void deposit(int money){
        System.out.println(money+"�� �Ա��մϴ�.");
    } 

    public void payOut(int money){
        System.out.println(money+"�� ����մϴ�.");
    } 
    
    //main method
    public static void main(String[] args){

        HanmiBank hb = new HanmiBank("�ѹ�����");
        hb.display();
        hb.deposit(100);
        hb.payOut(200);

        //interface ���ο� ����� field �ǹ̸� ����
        //interface �� field �� Ȯ��
        System.out.println(Deposit.deposit); // >> static�� ���ٹ����? 
        System.out.println(hb.payOut);       // >> static�� ���ٹ����?

        //field�� ���°��� �����غ���
        // Deposit.deposit = "�Ա�";
        // PayOut.payOut = "���";
        // >> compile ���� �߻� interface�� ����Ǵ� ������ final static Ư¡�� ����

    }//end of main 
}//end of class