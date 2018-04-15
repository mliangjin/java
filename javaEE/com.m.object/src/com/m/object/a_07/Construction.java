package com.m.object.a_07;

/*
	构造方法
			给对象的数据进行初始化
		格式
			A:方法名与类名相同
			B:方法没有返回值类型
			C:没有具体的返回值
		注意事项
			A:如果没有写构造方法，系统会自动提供一个无参的构造方法
			B:如果写了构造方法，系统不再提供默认的无参构造方法
		重载
			构造方法也有重载，需要提供无参数和有参的构造方法
	
 */

public class Construction {

	public static void main(String[] args) {
		Student2 s2 = new Student2();
		Student3 s3 = new Student3("明日香");
		Student3 s4 = new Student3();
		s3.show();
		s4.show();
	}

}

// 无参的构造方法
class Student2{
	public Student2() {
		System.out.println("这是构造方法");
	}
}

// 给对象数据初始化的构造方法
class Student3{
	String name;
	public Student3() {
		
	}
	public Student3(String name) {
		System.out.println("这是构造方法");
		this.name = name;
	}
	public void show() {
		System.out.println(name);
	}
}
