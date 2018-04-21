package com.m.object.c_09;

/*
 	多态
 		有继承关系
 		有方法重写
 		有父类引用指向子类对象
 	多态中的成员访问特点
 		A:成员变量
 			编译看左边，运行看左边 
 		B:构造方法
 			访问父类的构造方法，对父类的数据初始化
 		C:成员方法
 			编译看左边，运行看右边
 		D:静态方法
 			编译看左边，运行看左边
 			静态和类相关，算不上重写，所以访问的还是左边
 	
 	多态只能使用父类的功能，不能使用子类的特有功能
 	但是：可以通过向下转形，强转对象的类型，然后使用子类的特有功能
 	
 	 
 */			

public class DuoTai {
	public static void main(String[] args) {
		Fu f = new Zi();
		f.show();
		Zi z = (Zi)f;
		z.function();
	}
}

class Fu{
	public int num = 100;
	
	public void show() {
		System.out.println(num);
	}
}

class Zi extends Fu{
	public int num = 200;
	public int num2 = 2000;
	
	public void show() {
		System.out.println(num);
	}
	public static void function() {
		System.out.println("zi");
	}
}

