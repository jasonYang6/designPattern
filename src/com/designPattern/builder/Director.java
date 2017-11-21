package com.designPattern.builder;

/**
 * 建造者模式中的导演,发布建造的命令,确定建造顺序
 * 
 * @author Jason
 *
 */
public class Director {
	Builder builder;

	public Director(Builder builder) {
		this.builder = builder;
	}

	// 确定建造过程
	public void build() throws Exception {
		if (builder == null) {
			throw new Exception("建造者不能为空!");
		}
		builder.buildPartA();
		builder.buildPartB();
	}

	// 返回产品
	public Product getProduct() {
		if (builder != null) {
			return builder.getProduct();
		}
		return null;
	}
}
