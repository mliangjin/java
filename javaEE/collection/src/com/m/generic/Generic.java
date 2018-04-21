package com.m.generic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 	范型：是一种把数据类型的工作推迟到，创建对象或者调用方法的时候才去明确的特殊类型
 	参数化类型，把类型当作参数一样传递
 	
 	好处
 		把运行时期的数据类型问题提示报错
 		避免强制类型转换
 		优化程序设计解决Eclipse黄色警告线
 */


public class Generic {
	public static void main(String[] args) {
		// 在创建对象的时候明确数据类型
		ArrayList<String> array = new ArrayList<String>();
		
		array.add("hello");
		array.add("wrold");
		array.add("java");
		
		// array.add(new Integer(100)) 	引用类型
		// 自动装箱，10是一个引用类型 Integer
		// 通过范型，在添加不是String类型的时候报错
		// array.add(10);					
		
		Iterator<String> it = array.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		List<String> l = null;
		for(String i: l) {
			System.out.println(i);
		}
	}
}
