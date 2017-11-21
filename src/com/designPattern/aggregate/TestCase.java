package com.designPattern.aggregate;

import org.junit.Test;

public class TestCase {
	@Test
	public void test() {
		String test = "I`m jason";
		Aggregate<String> aggregate = new ConcreteAggregate(test);
		Iterator<String> iterator = aggregate.createIterator();
		System.out.println("字符的长度:" + iterator.getSize());
	}
}
