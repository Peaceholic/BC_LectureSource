package jb05.part08;

// abstract class�� interface(����� ����)�� �޸� �Ϲ� ���� method�� field�� ������ �ִ�. 

public abstract class Bank 
{
    //field
    private String name;

    //constructor
    public Bank(){
    }

    public Bank(String name){
        this.name = name;
    }

    //method
    //������� ����ϴ� display method�� �߻� method�� ����
    public abstract void display();

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    } 
}