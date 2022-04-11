package spring.service.aop.advice;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class BeforeLogAdvice implements MethodBeforeAdvice {

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		
		System.out.println("\n=======================================\n");
		System.out.println("[beforeLog]" + getClass() +" .before() start....");
		System.out.println("[beforeLog] targetObject call Method : "+ method);
		
		if(args.length !=0) {
			System.out.println("[beforeLog] targetObject Method РќДо argument: "+ args[0]);
		}

		System.out.println("[beforeLog]" + getClass() +" .before() end....");

	}
}
