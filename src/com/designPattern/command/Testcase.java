package com.designPattern.command;

import org.junit.Test;

/**
 * 测试类
 * 
 * @author jason
 *
 */
public class Testcase {
	@Test
	public void test() {// 测试方法
		Receiver receiver = new Receiver();
		Command cmd = new MyCommand(receiver);
		Invoker invoker = new Invoker(cmd);
		invoker.action();

	}
}
