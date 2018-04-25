package com.lean.ssm.chapter2.intercept;

import java.lang.reflect.Method;

public interface Interceptor {
	/**
	 * 拦截机
	 * @param proxy 代理对象
	 * @param target 真实对象
	 * @param method 方法
	 * @param args 运行方法参数
	 * @return
	 */
	public boolean before(Object proxy, Object target, Method method, Object[] args);
	public void around(Object proxy, Object target, Method method, Object[] args);
	public void after(Object proxy, Object target, Method method, Object[] args);
}
