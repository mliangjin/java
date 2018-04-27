package com.ssm.chapter9;

public class JuiceMaker2 {
	private String beverageShop = null;
	private JuiceSource juiceSource = null;
	
	public String makeJuice() {
		String juice = "这是一杯由" + beverageShop + "饮品店，提供的" + juiceSource.getSize() + juiceSource.getSugar() + juiceSource.getFruit();
		return juice;
	}

	public String getBeverageShop() {
		return beverageShop;
	}

	public void setBeverageShop(String beverageShop) {
		this.beverageShop = beverageShop;
	}

	public JuiceSource getJuiceSource() {
		return juiceSource;
	}

	public void setJuiceSource(JuiceSource juiceSource) {
		this.juiceSource = juiceSource;
	}
	
}
