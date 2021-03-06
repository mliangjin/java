package com.m.object.c_09;

/*
	final 关键字最终的意思
		常见的是它可以修饰，类，方法，变量
		final 类，该类不能被继承
		final 方法，该方法不能被继承后重写
		final 变量，该变量不能被修改，这个就是常量
		
		final 的初始化时机
			A:只能赋值一次
			B:在构造方法完毕前(非静态的常量)
		
		常量：
			A:字面值常量
				"hello"，10，true
			B:自定义常量
				final int i = 1
		
		面试题: final修饰局部变量
			局部变量是，基本数据类型，不能改变值
			局部变量是，引用数据类型，不能改变地址值，比如又赋值一个类
		
	在继承中的应用
		由于继承中有重写的这种特性
		如果父类不想被子类重写，那么加上final关键字就可以了
 */

public class Final {
	public static void main(String[] args) {
		final Test t = new Test();
		t.age = 100;
		System.err.println(t.age);
		// 报错 
		// t = new Test();
	}
}

class Test{
	int age = 10;
}


