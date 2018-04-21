package com.m.object.d_String;

/*
	字符串的特点:一旦被赋值，就不能被改变
	
	String s = new String("hello")	String s = "hello"
	== :	比较引用类型，比较的是地址值是否相同
	equals:	比较引用类型，默认也是比较地址值，但是，String类重写了equals()方法，比较的是内容是否相同
	
	字符串如果是变量相加，先开空间，再拼接
	字符串如果是常量相加，先相加，再在常量池找，如果有就直接返回
 */

public class String02 {

	public static void main(String[] args) {
		String s = "hello";
		String s1 = "world";
		String s2 = new String("hello");
		String s3 = "hellowrold";
		
		// new拿堆中方法 直接赋予值拿常量池
		// 而 new 每次会开辟新的内容所以new出来的内存地址是不一样的
		System.out.println(s == s2);		// false	
		System.out.println(s.equals(s2));	// true
		System.out.println(s3 == "hello"+"wrold"); // true	常量相加先把常量加起来，看有没有
		System.out.println(s3 == s+s1); 	// false		变量先开空间再复制一个新的地址
		

	}
}
