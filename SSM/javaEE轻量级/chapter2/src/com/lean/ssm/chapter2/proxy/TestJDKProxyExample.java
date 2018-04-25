package com.lean.ssm.chapter2.proxy;

public class TestJDKProxyExample {
	public static void main(String[] args) {
		testJDKProxy();
	}
	
	public static void testJDKProxy() {
		JDKProxyExample jdk = new JDKProxyExample();
		HelloWorld hw = (HelloWorld) jdk.bind(new HelloWorldImpl());
		hw.sayHelloWorld();
	}
}
