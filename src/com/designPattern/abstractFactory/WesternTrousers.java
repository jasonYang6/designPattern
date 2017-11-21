package com.designPattern.abstractFactory;

/**
 * 裤子的实现类
 * 
 * @author jason
 *
 */
public class WesternTrousers extends Trousers {
	private int waistSize;
	private int height;
	private String name;

	WesternTrousers(String name, int waistSize, int height) {
		this.name = name;
		this.waistSize = waistSize;
		this.height = height;
	}

	@Override
	public int getHeight() {
		return height;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getWaistSize() {
		return waistSize;
	}
}
