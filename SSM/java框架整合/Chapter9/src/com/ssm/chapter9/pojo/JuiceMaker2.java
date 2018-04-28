package com.ssm.chapter9.pojo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class JuiceMaker2 implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean{
	private String beverageShop = null;
	private Source source = null;
	
	public String getBeverageShop() {
		return beverageShop;
	}
	public void setBeverageShop(String beverageShop) {
		this.beverageShop = beverageShop;
	}
	public Source getSource() {
		return source;
	}
	public void setSource(Source source) {
		this.source = source;
	}
	
	public String makeJuice() {
		String juice = "这是一杯由" + beverageShop + "饮品店，提供的" + source.getSize() + source.getSugar() + source.getFruit();
		return juice;
	}
	
	public void init() {
		System.out.println("[" + this.getClass().getSimpleName() + "] 执行自定义初始化方法");
	}
	public void destroy() {
		System.out.println("[" + this.getClass().getSimpleName() + "] 执行自定义销毁方法");
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("[" + this.getClass().getSimpleName() + "] 执行 InitializingBean 的 afterPropertiesSet 方法");		
	}
	@Override
	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		System.out.println("[" + this.getClass().getSimpleName() + "] 执行 ApplicationContextAware 的 setApplicationContext 方法");
	}
	@Override
	public void setBeanFactory(BeanFactory arg0) throws BeansException {
		System.out.println("[" + this.getClass().getSimpleName() + "] 执行 BeanFactoryAware 的 setBeanFactory 方法");
	}
	@Override
	public void setBeanName(String arg0) {
		System.out.println("[" + this.getClass().getSimpleName() + "] 执行 BeanNameAware 的 setBeanName 方法");
	}
	
}
