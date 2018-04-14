package com.m.m_request.b_register;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import com.m.domain.User;

/**
 * 注册
 */
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1.设置编码
		request.setCharacterEncoding("utf-8");
		// 2.封装数据
		// 创建一个user 调用user.setXxx()一个一个封装太麻烦
		// 使用beanUtils封装对象
		User user = new User();
		try {
			BeanUtils.populate(user, request.getParameterMap());
			
			// 3.调用userservice.regist(user) 返回值 int
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();
		}
		
		doGet(request, response);
	}

}
