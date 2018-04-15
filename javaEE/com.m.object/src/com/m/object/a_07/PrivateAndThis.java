package com.m.object.a_07;

/*
	private
		private 修饰的成员变量，外部不能访问
		private 修饰的成员方法，外部不能使用
		
		给予外部提供get和set方法，以供外部访问私有的成员变量
		
	this
		所在类的引用
		(类 new出来的实例，代表当前的对象实例，谁用该方法this就是谁)
 */

public class PrivateAndThis {
	public static void main(String[] args) {
		PrivateDemo pd = new PrivateDemo();
		System.out.println(pd.getM());
		pd.setM(10);
		System.out.println(pd.getM());
	}
}

class PrivateDemo {
	
	private int m;
	
	private void method() {
		System.out.println("私有的成员方法");
	};
	
	public int getM() {
		return this.m;
	}
	
	public void setM(int newM) {
		this.m = newM;
	}
}
