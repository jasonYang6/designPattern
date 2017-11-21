package com.designPattern.single;

import org.junit.Test;

/**
 * 测试函数
 * 
 * @author jason
 *
 */
public class TestCase {
	@Test
	public void test() {
		Recyle r1 = Recyle.getInstance();
		Recyle r2 = Recyle.getInstance();
		if (r1 == r2) {
			System.out.println("为同一个实例");
		} else {
			System.out.println("不是一个实例");
		}
	}
}
