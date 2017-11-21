package com.designPattern.strategy;

import org.junit.Test;

/**
 * 测试
 * 
 * @author Jason
 *
 */
public class TestCase {
	@Test
	public void test() {
		Strategy bus = new BusStrategy();//定义出行方式
		Context context = new Context(bus);//定义出行
		context.action();
	}
}
