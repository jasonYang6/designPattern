package com.designPattern.decorator;

//Decorator装饰角色
public class NewRoom implements IRoom {

	IRoom room;

	public NewRoom(IRoom room) {
		this.room = room;
	}

	@Override
	public void show() {
		room.show();
	}

}
