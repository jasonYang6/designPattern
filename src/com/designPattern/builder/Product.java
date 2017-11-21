package com.designPattern.builder;

/**
 * 需要生产的复杂对象(代替我们点餐的套餐)
 * 
 * @author Jason
 *
 */
public class Product {
	private String name;
	private String partA;
	private String partB;

	public Product() {

	}

	public Product(String name) {
		this.name = name;
	}

	public String getPartA() {
		return partA;
	}

	public void setPartA(String partA) {
		this.partA = partA;
	}

	public String getPartB() {
		return partB;
	}

	public void setPartB(String partB) {
		this.partB = partB;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
