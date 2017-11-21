package com.designPattern.simpleFactory;

//具体的产品Apple
public class Apple implements Fruit {
	String name = "苹果!";

	public Apple() {
		System.out.println("一个苹果被创造!");
	}

	@Override
	public String getName() {
		return name;
	}

}
