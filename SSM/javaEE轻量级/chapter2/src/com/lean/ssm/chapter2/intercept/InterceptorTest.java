package com.lean.ssm.chapter2.intercept;

import com.lean.ssm.chapter2.proxy.HelloWorld;
import com.lean.ssm.chapter2.proxy.HelloWorldImpl;

public class InterceptorTest {

	public static void main(String[] args) {
		
		// 拦截器
		// HelloWorld proxy = (HelloWorld) InterceptorJDKProxy.bind(new HelloWorldImpl(), "com.lean.ssm.chapter2.intercept.InterceptorImpl");
		// proxy.sayHelloWorld();
		
		// 责任链模式，拦截器
		HelloWorld proxy1 = (HelloWorld) InterceptorJDKProxy.bind(new HelloWorldImpl(), "com.lean.ssm.chapter2.intercept.InterceptorImpl1");
		HelloWorld proxy2 = (HelloWorld) InterceptorJDKProxy.bind(proxy1, "com.lean.ssm.chapter2.intercept.InterceptorImpl2");
		HelloWorld proxy3 = (HelloWorld) InterceptorJDKProxy.bind(proxy2, "com.lean.ssm.chapter2.intercept.InterceptorImpl3");
		proxy3.sayHelloWorld();
	}

}
