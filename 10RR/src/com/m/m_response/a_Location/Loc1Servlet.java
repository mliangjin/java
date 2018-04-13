package com.m.m_response.a_Location;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 重定向
 */
public class Loc1Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Loc1 重定向");
		
		// 方法1
		// 设置状态吗
		// response.setStatus(302);
		// 设置响应头
		// response.setHeader("location", "/1001RquRsp/loc2");
		
		// 方法2
		response.sendRedirect("/1001RquRsp/loc2");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
