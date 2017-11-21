package com.designPattern.decorator;

//被装饰之后的房子A
public class BeautifulRoom extends NewRoom {

	public BeautifulRoom(IRoom room) {
		super(room);
		// TODO Auto-generated constructor stub
	}
	//为房子附加新的功能
	public void decorate() {
		// do something
		System.out.println("漂亮的房子!");
	}

	@Override
	public void show() {
		super.show();
		decorate();
	}
}
