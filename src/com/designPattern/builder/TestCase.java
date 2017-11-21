package com.designPattern.builder;

import org.junit.Test;

public class TestCase {
	@Test
	public void test() throws Exception {
		Product product = new Product("A");
		Builder builder = new ConcreteBuilder(product);
		Director director = new Director(builder);
		director.build();// 进行建造
		director.getProduct();
	}
}
