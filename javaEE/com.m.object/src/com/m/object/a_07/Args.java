package com.m.object.a_07;

/*
	形式参数：
		基本类型：形式参数的改变不影响实际参数
		引用类型：形式参数的改变直接影响实际参数
 */

public class Args {
	public static void main(String[] args) {
		// 基本类型
		Demo d = new Demo();
		int s = d.sun(10, 20);
		System.out.println(s);
		// 引用类型
		StudentDemo sd = new StudentDemo();
		Student st = new Student();
		sd.method(st);
	}

}

// 形式参数是基本类型
class Demo {
	public int sun(int a, int b) {
		return a + b;
	}
}

// 形式参数是引用类型
class Student {
	public void show() {
		System.out.println("我爱java");
	}
}

class StudentDemo {
	// 如果一个方法的形式参数是一个类类型(引用类型)，这里需要的是该类的对象
	public void method(Student s) {
		s.show();
	}
}