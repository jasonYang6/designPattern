package com.designPattern.abstractFactory;

/**
 * 工厂的实现类
 * 
 * @author jason
 *
 */
public class BeijingClothesFactory extends ClothesFactory {
	@Override
	public Trousers createTrousers(int waistSize, int height) {
		return new WesternTrousers("北京牌裤子", waistSize, height);
	}

	@Override
	public UpperClothes createUpperClothes(int chestSize, int height) {
		return new WesternUpperClothes("北京牌上衣", chestSize, height);
	}
}
