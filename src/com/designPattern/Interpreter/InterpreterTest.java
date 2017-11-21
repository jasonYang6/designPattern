package com.designPattern.Interpreter;

import org.junit.Test;

import junit.framework.TestCase;

/**
 * 测试类
 * 
 * @author jason
 * 
 */
public class InterpreterTest extends TestCase {
	@Test
	public void test1() {
		Context context = new Context(2, 1);
		Minus minus = new Minus();
		assertEquals(1, minus.interpret(context));
	}

	@Test
	public void test2() {
		Context context = new Context(2, 1);
		Plus plus = new Plus();
		assertEquals(3, plus.interpret(context));
	}

}
