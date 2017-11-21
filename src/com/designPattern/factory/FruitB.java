package com.designPattern.factory;

/*
 * 水果B
 */
public class FruitB implements Fruit {

	public FruitB() {
		System.out.println("产品B被创建！");
	}

	@Override
	public void introducte() {
		System.out.println("我是B产品！");

	}

}
