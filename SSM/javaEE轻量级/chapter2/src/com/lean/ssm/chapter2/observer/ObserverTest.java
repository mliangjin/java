package com.lean.ssm.chapter2.observer;

public class ObserverTest {

	public static void main(String[] args) {
		ProductList observable = ProductList.getInstance();
		TaoBaoObserver taoBaoObserver = new TaoBaoObserver();
		JingDongObserver jingDongObserver = new JingDongObserver();
		
		observable.addObserver(jingDongObserver);
		observable.addObserver(taoBaoObserver);
		
		observable.addProduct("新增产品 1");

	}

}
