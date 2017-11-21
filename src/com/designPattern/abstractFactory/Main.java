package com.designPattern.abstractFactory;

import org.junit.Test;

/**
 * 测试函数
 * 
 * @author jason
 *
 */
public class Main {

	@Test
	public void test() {
		ClothesFactory factory = new BeijingClothesFactory();// 北京衣服工厂
		factory.createTrousers(10, 20);// 让北京工厂生产裤子
		factory = new ShanghaiClothesFactory();// 上海衣服工厂
		factory.createTrousers(10, 20);// 让上海工厂生产裤子
	}
}
