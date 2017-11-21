package com.designPattern.abstractFactory;

/*
 * 衣服工厂的抽象类
 */
public abstract class ClothesFactory {
	public abstract UpperClothes createUpperClothes(int chestSize, int height);

	public abstract Trousers createTrousers(int waistSize, int height);
}
