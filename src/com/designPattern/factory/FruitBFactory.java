package com.designPattern.factory;

/*
 * 水果B工厂
 */
public class FruitBFactory implements Factory {

	@Override
	public Fruit createProduct() {
		// TODO Auto-generated method stub
		return new FruitB();
	}

}
