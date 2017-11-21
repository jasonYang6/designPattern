package com.designPattern.prototype;

import java.io.IOException;

import org.junit.Test;

public class TestCase {

	@Test
	public void test() throws CloneNotSupportedException, ClassNotFoundException, IOException{
		People you = new People("jason",20);
		you.addDuty("study");
		you.addDuty("work");
		System.out.println("初始的你:");
		System.out.println(you.toString());
		People doubleYou=(People)you.clone();
		you.addDuty("eat");
		you.setName("jason1");
		you.setAge(19);
		doubleYou.addDuty("play");
		doubleYou.setName("jason2");
		doubleYou.setAge(20);
		People triYou=(People)you.deepClone();
		triYou.addDuty("sleep");
		triYou.setName("jason3");
		triYou.setAge(21);
		System.out.println("克隆后的你:");
		System.out.println("you:"+you.toString());
		System.out.println("doubleYou:"+doubleYou.toString());
		System.out.println("triYou:"+triYou.toString());
	}
}
