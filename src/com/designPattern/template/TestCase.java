package com.designPattern.template;

import org.junit.Test;

/**
 * 测试用例
 * 
 * @author Jason
 *
 */
public class TestCase {
	@Test
	public void test() {
		Cooker cooker = new Cooker();
		cooker.doTask();
		Waiter waiter = new Waiter();
		waiter.doTask();
	}
}
