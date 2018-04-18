package com.m.a_springaop;

import org.aspectj.lang.ProceedingJoinPoint;

// 通知类
public class MyAdvice {
	// 前置通知
	// 		在目标方法前调用
	// 后置通知
	// 		在目标方法后调用 (如果出现异常则不调用)
	// 环绕通知
	// 		在目标方法前后调用
	// 异常拦截通知
	// 	 	如果出现异常调用
	// 后置通知
	// 		在目标方法运行之后调用
	
	public void before() {
		System.out.println("这是前置通知");
	}
	public void afterReturning() {
		System.out.println("这是后置通知 (异常不调用)");
	}
	
	// 环绕通知
	public Object around(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("这是环绕通知之 前");
		// 调用目标方法
		Object proceed = pjp.proceed();
		
		System.out.println("这是环绕通知之 后");
		
		return proceed;
	}
	
	public void afterException() {
		System.out.println("出现异常通知");
	}
	
	public void after() {
		System.out.println("出现异常也会调用");
	}
	
	
}
