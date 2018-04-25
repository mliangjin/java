package com.lean.ssm.chapter2.intercept;

import java.lang.reflect.Method;

public class InterceptorImpl2 implements Interceptor {

	@Override
	public boolean before(Object proxy, Object target, Method method, Object[] args) {
		System.out.println("拦截器 2 的before方法");
		return true;	// 不反射代理对象
	}

	@Override
	public void around(Object proxy, Object target, Method method, Object[] args) {
		System.out.println("拦截器 2 的around方法");
	}

	@Override
	public void after(Object proxy, Object target, Method method, Object[] args) {
		System.out.println("拦截器 2 的after方法");
	}

}
