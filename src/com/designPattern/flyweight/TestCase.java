package com.designPattern.flyweight;

import org.junit.Test;

/**
 * 测试类
 * 
 * @author Jason
 *
 */
public class TestCase {

	@Test
	public void test() {
		GoodsFactory factory = new GoodsFactory();
		Flyweight flyweight1 = factory.getFlyweight("剪刀");// 创建剪刀对象
		Flyweight flyweight2 = factory.getFlyweight("剪刀");// 不创建剪刀对象
		System.out.println(flyweight1 == flyweight2);// 判断取得的物品是否相同
	}
}
