package com.designPattern.state;

import org.junit.Test;

/**
 * 状态模式的测试类
 * 
 * @author jason
 *
 */
public class TestCase {
	@Test
	public void test() {
		Context context = new Context(7);
		context.doThing();
		context.setTime(15);
		context.doThing();
		context.setTime(17);
		context.doThing();
		context.setTime(7);
		context.doThing();
	}
}
