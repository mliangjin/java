package com.m.object.c_09;

/*
 	接口的特点
 		A:接口的关键字interface表示
 			interface 接口名 {}
 		B:类实现接口用implements表示
 			class 类名 implements 接口名 {}
 		C:接口不能实例话
 			接口要按照多态的方式实例话
 		D:接口的子类
 			a:可以是抽象类。意义不大
 			b:可以是具体类，要实现接口的抽象方法
 		由此可见:
 			A:具体类多态(几乎没有)
 			B:抽象类多态(常用)
 			C:接口多态(最常用)
 	接口的成员特点
 		成员变量: 默认是都是常量，默认都是静态的 public static final
 		构造方法: 接口没有构造方法
 			在实现接口后，实现类构造方法调用 super();调的是Object的构造方法
 		成员方法: 只能是abstract，只能是public
 	所有的类都默认继承 Object
 		Object 构造方法是一个无参的构造
 			Object()
 	类 Object 是类层次的根类。 每个类都使用 Object 作为超类
 */

public class Interface {
	public static void main(String[] args) {
		AnimalTrain a = new Dog2();
		// a.jump();
		// a.num = 1;
		// a.num2 = 2;
		// 默认常量
		// System.out.println(a.num);
		// System.out.println(a.num2);
		// 默认静态
		// System.out.println(AnimalTrain.num);
	}
}

interface AnimalTrain{
	// 变量
	public int num = 10;
	// 常量
	public final int num2 = 20;
	// 完整成员的写法
	public static final int num3 = 30;
	// 抽象方法
	public abstract void jump();
}

class Dog2 implements AnimalTrain{
	public void jump() {
		System.out.println("dog");
	}
}
 