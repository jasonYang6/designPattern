package com.designPattern.simpleFactory;

import org.junit.Test;
//简单工厂模式的测试类
public class SimpleFactoryTest {

	@Test
	public void test() {
		Factory factory = new Factory();//实例化工厂
		Fruit apple = factory.getFruit(Factory.apple);//从工厂获得苹果(从商贩出买苹果)
		Fruit banana = factory.getFruit(Factory.banana);//从工厂获得香蕉(从商贩出买香蕉)
		System.out.println("这个是一个" + apple.getName());
		System.out.println("这个是一个" + banana.getName());

	}
}
