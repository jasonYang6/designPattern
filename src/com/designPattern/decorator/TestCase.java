package com.designPattern.decorator;

public class TestCase {
	@org.junit.Test
	public void Test() {
		IRoom room = new Room();
		room.show();// 一个普通的房子
		BeautifulRoom broom = new BeautifulRoom(room);
		broom.show();// 一个漂亮的房子
		TVRoom troom = new TVRoom(broom);
		troom.show();// 一个既漂亮又可以看电视的房子
	}
}
