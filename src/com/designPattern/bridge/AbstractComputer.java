package com.designPattern.bridge;

/**
 * 电脑性能的实现类
 * 
 * @author jason
 * 
 */
public abstract class AbstractComputer {

	Ability ability;// 与cpu 组合的部分

	public AbstractComputer(Ability ability) {
		this.ability = ability;
	}

	public abstract void checkAbility() throws Exception;

}
