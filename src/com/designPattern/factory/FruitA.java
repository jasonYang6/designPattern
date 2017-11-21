package com.designPattern.factory;

/*
 * 产品A
 */
public class FruitA implements Fruit {

	public FruitA() {
		System.out.println("水果A被创建！");
	}

	@Override
	public void introducte() {
		System.out.println("我是A水果！");
	}

}
