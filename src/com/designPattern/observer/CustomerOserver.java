package com.designPattern.observer;

/**
 * 具体的观察者
 * 
 * @author Jason
 *
 */
public class CustomerOserver implements Oserver {
	private String name;

	public CustomerOserver(String name) {
		this.name = name;
	}

	@Override
	public void accept() {// 接收消息
		System.out.println(name + "收到内容");

	}

}
