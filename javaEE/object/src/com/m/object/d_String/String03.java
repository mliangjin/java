package com.m.object.d_String;

public class String03 {
	
/*
	判断功能
	boolean equals(object obj)		比较字符串的内存是否相同，区分大小写
	boolean equalsIgnoreCase(object obj)	比较字符串的内存是否相同，不 区分大小写
	boolean contains(String str)	判断是否包含
	boolean startWith(String str)	判断字符串是否以摸个 开头
	boolean endsWith(String str) 	判断字符串是否以摸个 结尾
	boolean isEmpty()				判断字符串是否 为空
		String s = ""   内容为空
		String s = null 对象不存在b	报错NullPointerException
 */
	public static void main(String[] args) {
		String s = "";
		String s2 = null;
		System.out.println(s.isEmpty()); //	true
		// System.out.println(s2.isEmpty()); 空指针错误
	}
}
