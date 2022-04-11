package jp01.part02;

public class CallByReferenceTest{

	///Field
	int number = 100;

	///Method
	public void referenceChange(CallByReferenceTest value)	{
		System.out.println("==================");
		value.number = 100 + value.number;
		System.out.println("value.number : "+value.number);
		System.out.println("==================");
	}

	///Main Method
		public static void main(String[] args) {

			CallByReferenceTest call = new CallByReferenceTest();

			//method 의 인자 값으로 call(Reference Data Type)
			call.referenceChange(call);
			System.out.println("call.number : "+call.number);
	}
}
