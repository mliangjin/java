package com.m.m_request.a_login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.javafx.collections.MappingChange.Map;

/**
 * 登陆验证
 */
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 请求行
		System.out.println("---------请求行----------");
		// 请求pi
		System.out.println(request.getRemoteAddr());
		// 请求项目名
		System.out.println(request.getContextPath());
		// 请求方式
		System.out.println(request.getMethod());
		// 请求协议
		System.out.println(request.getProtocol());
		
		// 请求头
		System.out.println("---------请求头----------");
		// 请求浏览器的内核
		System.out.println(request.getHeader("user-agent"));
		// ferer
		System.out.println(request.getHeader("referer"));
		
		// 请求参数
		System.out.println("---------请求参数----------");
		// 获取一个请求参数
		System.out.println(request.getParameter("name"));
		// 获取get参数，并转换字符编码
		//String name = request.getParameter("name");
		//name = new String(name.getBytes("iso8859-1"),"utf-8");
		//System.out.println(name);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 设置请求流的编码 utf-8
		request.setCharacterEncoding("utf-8");
		System.out.println(request.getParameter("name"));
	}

}
