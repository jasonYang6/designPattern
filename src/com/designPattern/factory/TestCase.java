package com.designPattern.factory;

import org.junit.Test;

/*
 * 测试类
 */
public class TestCase {

	@Test
	public void test() {
		Factory factory = new FruitAFactory();
		Fruit product = factory.createProduct();
		product.introducte();
		factory = new FruitBFactory();
		product = factory.createProduct();
		product.introducte();
	}

}
