package spring.service.aop.advice;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;


public class PojoAspectJ{
	
	
	public PojoAspectJ() {
		System.out.println(":: TESTAspectJ01 Default Constructor");
	}
	
	/*
	@Pointcut("execution(* *.getMessage(..))")
	public void work() {
		System.out.println("&&&& pointCut %%%%");
	}
	*/
	
	
	public void before(JoinPoint joinPoint)throws Throwable {
	
		System.out.println("[before LOG] "+getClass()+"before() start....");
		System.out.println("[before LOG] tagetObject : "+joinPoint.getTarget().getClass().getName());		
		System.out.println("[before LOG] tagetObject call Method : "+joinPoint.getSignature().getName());
		
		if(joinPoint.getArgs().length != 0) {
			System.out.println("[before LOG] tagerObject Call method argument : "+joinPoint.getArgs()[0]);
		}
		System.out.println("[before LOG] "+getClass()+"before() end...");
	}
	
	
	public void afterReturning (JoinPoint joinPoint, Object returnValue)throws Throwable{
		

		System.out.println("[afterReturning LOG] "+getClass()+" .afterReturning() start....");
		System.out.println("[afterReturning LOG] 타겟 객체 : "+ joinPoint.getTarget().getClass().getName());
		System.out.println("[afterReturning LOG] 타겟 객체의 호출된 메소드 : "+ joinPoint.getSignature().getName());
		System.out.println("[afterReturning LOG] 타켓 객체 호출 후 return value "+returnValue);
		System.out.println("[afterReturning Log] " + getClass()+".afterReturning() end....");

	}
	
	
	public Object invoke(ProceedingJoinPoint joinPoint)throws Throwable{
		
		System.out.println("[Around LOG] "+getClass()+".invoke() start....");
		System.out.println("[Around LOG] tagetObject call Method : "+joinPoint.getTarget().getClass().getName());
		System.out.println("[Around LOG] 타겟 객체의 호출된 메소드 : "+ joinPoint.getSignature().getName());
		
		if(joinPoint.getArgs().length != 0) {
			System.out.println("[Around LOG] tagerObject method 전달 argument : "+joinPoint.getArgs()[0]);
		}
		Object obj = joinPoint.proceed();
		
		System.out.println("[Around LOG] 타겟 객체의 호출후 return value : "+obj);
		System.out.println("[Around LOG] "+getClass()+".invoke() end...");

		return obj;
	}
	
	
	public void afterThrowing(JoinPoint joinPoint, Throwable throwable) {
		
		System.out.println("[exception] "+getClass()+"afterThrowing() start....");
		System.out.println("[exception] tagetObject call Method : "+joinPoint.getTarget().getClass().getName());
		System.out.println("[exception] 타겟 객체의 호출된 메소드 : "+ joinPoint.getSignature().getName());

		System.out.println("[exception] Exception 발생...");
		System.out.println("[exception] Exception Message : "+throwable.getMessage());
		System.out.println("[exception] "+getClass()+"afterThrowing() end...");

	}
}
