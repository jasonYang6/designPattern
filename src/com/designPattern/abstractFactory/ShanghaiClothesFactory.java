package com.designPattern.abstractFactory;

/**
 * 工厂的吸纳类
 * 
 * @author jason
 *
 */
public class ShanghaiClothesFactory extends ClothesFactory {
	@Override
	public Trousers createTrousers(int waistSize, int height) {
		return new WesternTrousers("上海牌裤子", waistSize, height);
	}

	@Override
	public UpperClothes createUpperClothes(int chestSize, int height) {
		return new WesternUpperClothes("上海牌上衣", chestSize, height);
	}
}
