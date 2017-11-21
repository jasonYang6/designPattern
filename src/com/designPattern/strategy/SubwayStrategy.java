package com.designPattern.strategy;

/**
 * 地铁策略
 * 
 * @author Jason
 *
 */
public class SubwayStrategy implements Strategy {

	@Override
	public void action() {
		System.out.println("坐地铁");

	}

}
