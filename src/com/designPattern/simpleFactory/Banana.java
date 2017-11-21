package com.designPattern.simpleFactory;

//具体的产品Apple
public class Banana implements Fruit {
	String name = "香蕉!";

	public Banana() {
		System.out.println("一个香蕉被创造!");
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

}
