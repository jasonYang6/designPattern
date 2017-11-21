package com.designPattern.strategy;

/**
 * 公共汽车策略
 * 
 * @author Jason
 *
 */
public class BusStrategy implements Strategy {

	@Override
	public void action() {
		System.out.println("坐公共汽车!");

	}

}
