package jb05.part08;

// bank, deposit, payout class를 이용하여 hanmibank를 구현
// bank, deposit, payout 는 어떤은행에서도 사용될 수 있다
// deposit, payout 는 금융기관이면 어디서나 사용 할 수 잇는 기능을 정의한 class
//   (금융기관은 반드시 입/출 금 기능이 존재 


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
        System.out.println("은행명: "+ this.getName());
    }

    public void deposit(int money){
        System.out.println(money+"를 입금합니다.");
    } 

    public void payOut(int money){
        System.out.println(money+"를 출금합니다.");
    } 
    
    //main method
    public static void main(String[] args){

        HanmiBank hb = new HanmiBank("한미은행");
        hb.display();
        hb.deposit(100);
        hb.payOut(200);

        //interface 내부에 선언된 field 의미를 이해
        //interface 의 field 를 확인
        System.out.println(Deposit.deposit); // >> static의 접근방식은? 
        System.out.println(hb.payOut);       // >> static의 접근방식은?

        //field의 상태값을 변경해보자
        // Deposit.deposit = "입금";
        // PayOut.payOut = "출금";
        // >> compile 오류 발생 interface에 선언되는 변수는 final static 특징을 갖음

    }//end of main 
}//end of class