package jp02.part02;

/*
java Exception Test 10 20 0 ����� 3��° ���ڰ��� 0�̸� ����� �����߻�
> ��°��(����� ����)�а� ��°�� Ȯ��
> �ذ� 1. try0catch()�� ����(Exception:: ����)�߻���Ȳ ó��, ���� ����
> �ذ� 2. throws �� JVM���� ������ ȣ����(������ �߻���Ų)������ �߻���
           Exception �� ������(?, ����). (���� : ȣ���� ��(���� ������ ��))
> �ذ� 3. JVM���� ������, program ���ο��� throws �ϴ� Exception(����ó��)��
          �ذ�å�� try-catch
*/

public class ExceptionTest04{
	
	//Field
	private int sum;
	private int avg;
	
	//Constructor
	public ExceptionTest04(){
	}

	//Method
	public void sum(int x,int y){
		System.out.println("1. ==>sum ����");
		sum = x + y;
		System.out.println("1. ==> ��:"+sum);
		System.out.println("1. ==> sum ��");
	}
	//JVM���� ���� ArithmeticException�� �ٽ� �ڽ��� ȣ���� ������ ����(? , ����)��
	public void avg(int z) throws ArithmeticException{
		System.out.println("2. ==> avg ����");		
		avg = sum/z;  //z = 0 �ΰ�� �Ҵ�
		System.out.println("��� : "+avg);
		System.out.println("2.==> avg��");
	}

	//main method
	public static void main(String[] args){
		int i =Integer.parseInt(args[0]);
		int j =Integer.parseInt(args[1]);
		int k =Integer.parseInt(args[2]);

		ExceptionTest04 et = new ExceptionTest04();
		et.sum(i,j);

		//JVM���� ���� ��, program ���� throws �ϴ� Exception(����ó��)�� �ذ�å�� try-catch
		try{
			et.avg(k);
		}catch(ArithmeticException e){
		//�������� �ּ�ó���ϰ� �Ʒ��� �ּ��� Ǯ�� �����ϸ�...
		//}catch(Exception e){           
			
			//Exception e = new ArithmeticException(); 
			//�����Ѱ� ? �����ϴ�
			System.out.println("");
			System.out.println("<<1>>============================");
			System.out.println("z���� 0�� ��� �Դϴ�. ������ �Ұ�");
			System.out.println("<<2>>============================");
			System.out.println(e); //System.out.println(e.toString());
			System.out.println("<<3>>============================");
			e.printStackTrace();
			System.out.println("<<4>>============================");
		}

		System.out.println("<<5>> main Method End....");
	}
}