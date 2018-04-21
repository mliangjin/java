package com.m.object.c_09;

/*
	抽象类的概述
		一个不是具体的功能成为抽象类，而一个类如果有抽象的功能，该类必须是抽象类
	抽象类的特点
		A:抽象类和抽象方法必须用abstract修饰
		B:抽象类中不一定有抽象方法，有抽象方法的类必须定义为抽象类
		C:抽象类不能实例话，因为它不是具体的
			抽象类有构造方法，用于子类访问父类数据的初始化
		D:抽象类的子类
			a:抽象类的子类是一个抽象类
			b:抽象类的子类是一个具体的类，就必须重写父类的抽象方法
	抽象类的成员特点
		成员变量:可以是变量，可以是常量
		构造方法:有
		成员方法:可以是抽象的，可以是非抽象的
	抽象类的成员方法特性
		A:抽象方法 强制要求子类左的失去
		B:非抽象方法	子类继承的事情，提高代码复用性
 */

public class Abstract {
	public static void main(String[] args) {
		Animal a = new Cat();
		
		System.out.println(a.num);
		System.out.println(a.num2);
		a.cat();
	}

}

abstract class Animal {
	// 变量
	public int num = 10;
	// 常量
	public final int num2 = 20;
	
	// 有{} 就是有方法体，只是是一个空的方法体
	// 抽象方法不能有方法体
	// public abstract void car() {}
	public abstract void cat();
	public Animal() {};
}

// 抽象类继承抽象类，不用重写父类抽象方法
abstract class Dog extends Animal{}
// 抽象类的子类不是抽象类，就必须重写父类的抽象方法
class Cat extends Animal{
	public void cat() {
		System.out.println("cat");
	}
}

