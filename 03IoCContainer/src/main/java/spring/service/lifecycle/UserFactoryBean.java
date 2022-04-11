package spring.service.lifecycle;

import org.springframework.beans.factory.FactoryBean;

import spring.service.domain.User;

public class UserFactoryBean implements FactoryBean {

	/// Field
	
	// Constructor
	public UserFactoryBean() {
		System.out.println("\n :: " + getClass().getName() + " default »ý¼ºÀÚ");
	}
	
	public User getObject() {
		System.out.println("\n :: " + getClass().getName() + " getObject() ");
		return new User();
	}
	
	public Class getObjectType() {
		System.out.println("\n :: " + getClass().getName() + " getObjectType() ");
		return User.class;
	}
	
	public boolean isSingleton() {
		System.out.println("\n :: " + getClass().getName() + " isSingleton() ");
		
		//return true;
		return false;
	}	
	
}// end of class