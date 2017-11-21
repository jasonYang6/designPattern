package com.designPattern.decorator;

//room是基本实现类,被装饰的实体
public class Room implements IRoom {

	@Override
	public void show() {
		System.out.println("一个十分普通的房子!");

	}

}
