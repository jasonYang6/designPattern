package com.designPattern.abstractFactory;

/**
 * 上衣的具体实现类
 * 
 * @author jason
 *
 */
public class WesternUpperClothes extends UpperClothes {
	private int chestSize;
	private int height;
	private String name;

	WesternUpperClothes(String name, int chestSize, int height) {
		this.name = name;
		this.chestSize = chestSize;
		this.height = height;
	}

	@Override
	public int getChestSize() {
		return chestSize;
	}

	@Override
	public int getHeight() {
		return height;
	}

	@Override
	public String getName() {
		return name;
	}
}
