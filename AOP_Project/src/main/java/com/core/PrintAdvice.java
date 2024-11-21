package com.core;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PrintAdvice {
	
	
	@Before("execution(* com.core.HomeController.getmsg1())")
	public void beforeMsg() {
		System.err.println("Hello");
	}
	
	@After("execution(* com.core.HomeController.getmsg1())")
	public void afterMsg() {
		System.err.println("byyy");
	}
	
	@Around("execution(* com.core.HomeController.getmsg2())")
	public Object aroungMsg(ProceedingJoinPoint p) throws Throwable {
		System.err.println("Before message : Hello student");
		Object result = p.proceed();
		System.err.println("After message : byy student");
		return result;
	}
	
	

}
