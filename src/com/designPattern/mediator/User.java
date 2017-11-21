package com.designPattern.mediator;

/**
 * 用户的抽象
 * 
 * @author jason
 * 
 */
public abstract class User {
	Mediator mediator;

	/**
	 * 确保每个用户拥有一个中介对象
	 * 
	 * @param mediator
	 */
	public User(Mediator mediator) {
		this.mediator = mediator;
	}

	/**
	 * 发送消息
	 * 
	 * @param message
	 */
	public abstract void sendMessage(String message);

	/**
	 * 接受消息
	 * 
	 * @param message
	 */
	public abstract void acceptMessage(String message);

}
