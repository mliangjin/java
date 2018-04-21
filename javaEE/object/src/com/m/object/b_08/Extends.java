package com.m.object.b_08;

/*
 	继承
 	A: 成员变量 就近原则
	B: this访问本类成员 super访问父类成员
	C: 子类构造方法执行前，先执行父类构造方法
	D: 一个类的初始化构成
		成员变量的初始话
			默认初始化
			显示初始化
			构造方法初始化
	E: 分成初始化
		1.类中静态代码块FU		-(子类创建会执行FU类静态代码块)
		2.类中静态代码块ZI		-(静态代码块随着类的加载而加载)
		3.FU类构造代码块		
		4.FU类构造代方法
		5.ZI类构造代码块
		6.ZI类构造方法	
		7.执行方法		
	重写 
		子类重写父类方法
			方法的修饰符不能比父类小
			方法的类型要和父类一样
	重载
		同一个类下面两个方法名一样，其中的返回值或者参数个数，不一样。
		
 */

class Obj{
	public Obj() {
		System.out.println("obj构造方法");
	}
}

class Fu{
	public int num = 1;
	static {
		System.out.println("fu静态代码块");
	}
	{
		System.out.println("fu构造代码块");
	}
	public Fu() {
		System.out.println("fu构造方法");
	}
	public void show() {
		System.out.println("fu shou()");
	}
}

class Zi extends Fu{
	// 成员变量
	public int num = 2;
	// 静态代码块
	static {
		System.out.println("zi静态代码块");
	}
	// 构造代码块
	{
		System.out.println("zi构造代码块");
	}
	// 构造方法
	public Zi() {
		System.out.println("zi构造方法");
	}
	public void show() {
		// 局部变量
		int num = 3;
		System.out.println(num);
		System.out.println(this.num);
		System.out.println(super.num);
	}
	public int show(int i) {
		return i;
		
	}
	public String show(String i) {
		return i;
		
	}
}



public class Extends {
	public static void main(String[] args) {
		 Zi z = new Zi();
		 z.show();
		 System.out.println(z.show("java"));
	}

}

