package com.m.object.a_07;

/*
	匿名对象的应用场景
		A:调用方法，仅仅只调用一次
			匿名对象调用完毕就是垃圾。可以被垃圾回收器回收
 */

public class NoName {
	public static void main(String[] args) {
		// 匿名对象
		new Student1().show();
	}
}

class Student1 {
	public void show() {
		System.out.println("我爱java");
	}
}