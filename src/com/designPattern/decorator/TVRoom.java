package com.designPattern.decorator;

//被装饰之后的房子B
public class TVRoom extends NewRoom {

	public TVRoom(IRoom room) {
		super(room);
		// TODO Auto-generated constructor stub
	}

	/// 为房子附加新的功能
	public void addTV() {
		System.out.println("为房子安装电视!");
		System.out.println("一个可以看电视的房子!");
	}

	@Override
	public void show() {
		super.show();
		addTV();
	}

}
