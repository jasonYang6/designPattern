package com.designPattern.builder;

public class ConcreteBuilder extends AbstractBuilder {
	public ConcreteBuilder() {
		this(null);
	}

	public ConcreteBuilder(Product product) {
		super(product);
	}

	@Override
	public void buildPartA() {
		System.out.println("建造产品" + product.getName() + "的A部分");
		getProduct().setPartA("A");
	}

	@Override
	public void buildPartB() {
		System.out.println("建造产品" + product.getName() + "的B部分！");
		getProduct().setPartA("B");

	}

}
