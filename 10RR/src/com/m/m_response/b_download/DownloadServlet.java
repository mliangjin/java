package com.m.m_response.b_download;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;

public class DownloadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 文件下载
		// 1.获取下载文件的名称
		String filename = request.getParameter("name");
		// 2.设置文件的mimeType
		ServletContext context = this.getServletContext();
		String mimeTpye =  context.getMimeType(filename);
		response.setContentType(mimeTpye);
		// 3.设置下载的头信息
		response.setHeader("content-disposition", "attachment;filename="+filename);
		// 4.对拷流
		// 4.1.获取输入流
		InputStream is = context.getResourceAsStream("/download/"+filename);
		// 4.2 获取输出流
		ServletOutputStream os = response.getOutputStream();
		// int len = 0;
		// byte[] b = new byte[1024];
		// while((len=is.read(b)) != -1) {
		//	 os.write(b, 0, len);
		// }
		IOUtils.copy(is, os);
		os.close();
		is.close();
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
