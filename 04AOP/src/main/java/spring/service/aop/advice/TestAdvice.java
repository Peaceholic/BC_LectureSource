package spring.service.aop.advice;

import java.lang.reflect.Method;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.ThrowsAdvice;

public class TestAdvice implements MethodBeforeAdvice, AfterReturningAdvice, ThrowsAdvice, MethodInterceptor {

	public void before(Method method, Object[] args, Object target) throws Throwable {
		
		System.out.println("[before Log]" + getClass() +" .before() start....");
		System.out.println("[before Log] targetObject call Method : "+ method);
		
		if(args.length !=0) {
			System.out.println("[before Log] targetObject Method 전달 argument: "+ args[0]);
		}

		System.out.println("[before Log]" + getClass() +" .before() end....");
	}
	
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		
		System.out.println("[after Log]" + getClass() +" .afterReturning() start....");
		System.out.println("[after log] targetObject call Method : "+ method);
		
		System.out.println("[after Log] targetObject 호출 후 return value " + returnValue);
		
		System.out.println("[after Log]" + getClass() +" .afterReturning() end....");	

	}
	
	
	public Object invoke(MethodInvocation invocation) throws Throwable {
		
		System.out.println("[Around before]" + getClass() +" .invoke() start....");
		System.out.println("[Around before] targetObject call Method : "+ invocation.getMethod());
		
		if(invocation.getArguments().length != 0) {
			System.out.println("[Around before] targetObject method 전달 : " + invocation.getArguments()[0]);
		}		
		Object obj = invocation.proceed();
		
		System.out.println("[after after] targetObject 호출 후 return value " + obj);		
		System.out.println("[after after]" + getClass() +" .invoke() end....");	
		
		return obj;
	}

	public void afterThrowing(Throwable throwable) {
		
		System.out.println("[exception]" + getClass() +" .afterThrowing() start....");
		System.out.println("[exception] Exception 발생");		
		System.out.println("[exception] Exception message : " + throwable.getMessage());
		
		System.out.println("[exception]" + getClass() +" .afterThrowing() end....");	
		
	}
}
