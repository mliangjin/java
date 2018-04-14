package com.m.utf8;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class UTF8 {
	public static void main(String[] args) throws UnsupportedEncodingException {
		String s = "明日香";
		// 编码
		String s8 = URLEncoder.encode(s, "utf-8");
		
		System.out.println(s8);
		
		// 解码
		String so = URLDecoder.decode(s8, "iso8859-1");
		
		System.out.println(so);
	}
}
