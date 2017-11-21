package com.designPattern.builder;

/**
 * 建造者模式的监管者，确定建造的顺序。（这一级有时也可以省略）
 * 
 * @author Jason
 *
 */
public abstract class AbstractBuilder implements Builder {

	public Product product = new Product();// 建造的产品
	
	public AbstractBuilder() {
		this(null);
	}

	public AbstractBuilder(Product product) {
		if (product != null) {
			this.product = product;
		}
	}

	// 为其提供默认的构建过程
	public void build() {
		buildPartA();
		buildPartB();
	}

	// 得到产品
	public Product getProduct() {
		return product;
	}
}
