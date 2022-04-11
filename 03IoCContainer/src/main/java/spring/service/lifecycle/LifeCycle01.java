package spring.service.lifecycle;

import org.springframework.beans.factory.BeanNameAware;

import spring.service.lifecycle.LifeCycle01;

public class LifeCycle01 implements BeanNameAware {

		///Field
		
		//Constructor
		public LifeCycle01() {
			System.out.println("\n :: "+ getClass().getName()+" default 생성자");
		}
		
		@Override
		public void setBeanName(String name) {
			System.out.println("\n :: "+ getClass().getName()+".setBeanName() start ");
			System.out.println("\n xml에 정의된 beanname : "+name);
			System.out.println("\n :: "+ getClass().getName()+".setBeanName() end ");
			
		}	

		public void init() {
			System.out.println("\n :: "+ getClass().getName()+".init() ");
		}
		
		public void destory() {
			System.out.println("\n :: "+ getClass().getName()+".destroy() ");
		}
		

}// end of class