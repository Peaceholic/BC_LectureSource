package jp01.part02;

public class CallByValueTest{

	///Field
	int number = 100;

	///Method
	public void valueChange(int value)	{
		System.out.println("==================");
		value = value + 100;
		System.out.println("value :"+value);
		System.out.println("==================");
	}

	///Main Method
		public static void main(String[] args) {

			CallByValueTest call = new CallByValueTest();

			//method 의 인자 값으로 int(primitive Data Type)
			call.valueChange(call.number);
			System.out.println("number : "+call.number);
	}
}
