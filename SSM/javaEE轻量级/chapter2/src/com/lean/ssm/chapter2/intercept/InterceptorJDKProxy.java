package com.lean.ssm.chapter2.intercept;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class InterceptorJDKProxy implements InvocationHandler {
	private Object target; // 真实对象
	private String interceptorClass; // 拦截器全限定名

	public InterceptorJDKProxy(Object target, String interceptorClass) {
		this.target = target;
		this.interceptorClass = interceptorClass;
	}

	/**
	 * 绑定代理对象并返回一个代理占位
	 * @param target 真实对象
	 * @return 代理对象占位
	 */
	public static Object bind(Object target, String interceptor) {
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),
				new InterceptorJDKProxy(target, interceptor));
	}

	@Override
	/**
	 * 通过代理对象调用方法，首先进入这个方法
	 * @param proxy 真实对象
	 * @param method 被调用方法
	 * @param args 方法的参数
	 */
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// 取得代理对象
		if (interceptorClass == null) {
			// 没有设置拦截器则直接返回原有方法
			return method.invoke(target, args);
		}
		Object result = null;
		// 通过反射生成拦截器
		Interceptor interceptor = (Interceptor) Class.forName(interceptorClass).newInstance();
		// 调用前置方法
		if (interceptor.before(proxy, args, method, args)) {
			result = method.invoke(target, args);
		} else {
			interceptor.around(proxy, args, method, args);
		}
		// 调用后置方法
		interceptor.after(proxy, args, method, args);
		return result;
	}

}
