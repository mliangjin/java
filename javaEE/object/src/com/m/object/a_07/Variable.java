package com.m.object.a_07;

/*
	成员变量和局部变量的区别
		A:在类中的位置不同
			成员变量：在类中方法外
			局部变量：在方法定义中或者方法声明上
		B:在内存中的位置不同
			成员变量：堆内存(主要用来存放对象)
			局部变量：栈内存(主要用来执行程序)
		C:生命周期不同
			成员变量：随着对象的创建而存在，随着对象的消失而消失
			局部变量：随便方法的调用而存在，随便方法的调用完毕而消失
		D:初始化值不同
			成员变量：有默认初始化值
			局部变量：没有默认初始化值，必须定义，赋值，然后才能使用
 */

public class Variable {
	public static void main(String[] args) {
		VariableTest1 v = new VariableTest1();
		System.out.println(v.num);
	}
}
class VariableTest1{
	// 成员变量
	// int num = 10;
	int num;	// 默认值0
		
	public void show() {
		// 局部变量
		// int num2 = 20;
		// int num2;	不赋予值则报错
		// System.out.println(num2);
	}
}


