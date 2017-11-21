package com.designPattern.mediator;

/**
 * 具体租客
 * 
 * @author jason
 * 
 */
public class Renter extends User {
	private String name;

	public Renter(Mediator mediator, String name) {
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
