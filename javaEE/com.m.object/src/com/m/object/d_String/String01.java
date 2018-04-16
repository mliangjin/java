package com.m.object.d_String;

/*
 	字符串:多个字符组成的一串字符，可以看出一组字符组
 	API
 		字符串是常量: 他们的值创建之后不能更改，字符串缓冲区支持可变字符串。
 		因为	String 对象是不可变的，所以可以共享，例如
 			String str = "abc";
 		等效于
 			char date[] = ['a','b','c']
 			String str = new String(date)
 	构造方法
 		public String()										空构造
 		public String(byte[] bytes)							把字节数组转字符串
 		public String(byte[] bytes,int offset,int length)	把字节数组的一部分转字符串，索引，长度
 		public String(char[] value)							把字符数组转字符串
 		public String(char[] value,int offset,int count)	把字符数组的一部分转字符串，索引，长度
 		public String(String original)						把字符串常量转字符串
 		
 */

public class String01 {

	public static void main(String[] args) {
		
		// 空构造
		String s1 = new String();
		System.out.println("si+"+s1.length());
		System.out.println("--------------------");
		
		byte[] bys = {97,98,99,100,101,102};
		// public String(byte[] bytes)
		String s2 = new String(bys);
		System.out.println("s2+"+s2);
		System.out.println("--------------------");
		
		// public String(byte[] bytes,int offset,int length)
		String s3 = new String(bys,0,4);
		System.out.println("s3+"+s3);
		System.out.println("--------------------");
		
		char[] chs = {'a','b','c','d','e','爱'};
		// public String(char[] value)
		String s4 = new String(chs);
		System.out.println("s4+"+s4);
		System.out.println("--------------------");
		// public String(char[] value,int offset,int count)
		String s5 = new String(chs,0,4);
		System.out.println("s5+"+s5);
		System.out.println("--------------------");
		
		String s = "abc";
		
	}

}


































