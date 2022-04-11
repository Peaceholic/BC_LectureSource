package jb05.part08;

// 입금업무 interface정의

public interface Deposit
{
    //interface Field(member variable) ==> public static final 특성을 가진다
    String deposit="입금";

    //interface Method(member variable) ==> public abstract 특성을 가진다
    void deposit(int money);    
}
