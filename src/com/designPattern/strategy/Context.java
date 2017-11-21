package com.designPattern.strategy;

/**
 * 环境角色类
 * 
 * @author Jason
 *
 */
public class Context {
	Strategy strategy;

	public Context(Strategy strategy) {
		super();
		this.strategy = strategy;
	}

	/**
	 * 策略方法
	 */
	public void action() {
		strategy.action();
	}
}
