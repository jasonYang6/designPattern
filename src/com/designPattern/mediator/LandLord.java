package com.designPattern.mediator;

/**
 * 具体房东
 * 
 * @author jason
 * 
 */
public class LandLord extends User {
	private String name;

	// 构造函数
	public LandLord(Mediator mediator, String name) {
		super(mediator);
		this.name = name;
	}

	@Override
	public void sendMessage(String message) {
		mediator.declare(this, message);
	}

	@Override
	public void acceptMessage(String message) {
		System.out.println(name + "收到消息:" + message);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
