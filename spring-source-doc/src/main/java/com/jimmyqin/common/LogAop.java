package com.jimmyqin.common;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAop {
//	@Pointcut("execution(* com.jimmyqin.service.MyService.helloService())")
	@Pointcut("execution(* com.jimmyqin.service..*(..))")
	public void sendPoint(){}

	@Before("sendPoint()")
	public void registerBefore(JoinPoint joinPoint){
		System.out.println("register before");
	}

	@After("sendPoint()")
	public void registerAfter(){
		System.out.println("register after");
	}
}
