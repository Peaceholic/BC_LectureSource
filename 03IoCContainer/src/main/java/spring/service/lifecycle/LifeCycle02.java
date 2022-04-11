package spring.service.lifecycle;

public class LifeCycle02 {

	/// Field
	private static LifeCycle02 lifeCycle;

	// Constructor
	public LifeCycle02() {
		System.out.println("\n :: " + getClass().getName() + " default »ý¼ºÀÚ");
	}
	
	public static LifeCycle02 getInstance() {
		System.out.println("\n :: getInstance()");
		if( lifeCycle == null ) {
			lifeCycle = new LifeCycle02();
		}
		return lifeCycle;
	}
	
}// end of class