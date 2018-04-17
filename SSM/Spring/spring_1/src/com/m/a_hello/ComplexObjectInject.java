package com.m.a_hello;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * @author ComplexObjectInject
 * 
 */
public class ComplexObjectInject {

	private String[] a;
	private List<String> b;
	private Map<String, String> c;
	private Properties properties;

	public String[] getA() {
		return a;
	}

	public void setA(String[] a) {
		this.a = a;
	}

	public List<String> getB() {
		return b;
	}

	public void setB(List<String> b) {
		this.b = b;
	}

	public Map<String, String> getC() {
		return c;
	}

	public void setC(Map<String, String> c) {
		this.c = c;
	}

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	@Override
	public String toString() {
		return "User [a=" + Arrays.toString(a) + ", b=" + b + ", c=" + c + ", properties=" + properties + "]";
	}

}
