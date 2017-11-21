package com.designPattern.memento;

import org.junit.Test;

public class Testcase {
	@Test
	public void test() {
		Original ori = new Original("apple");
		Storage storage = new Storage(ori.createMemento());
		System.out.println("原始数据：" + ori.getVal());
		ori.setVal("banana");
		System.out.println("修改后的数据：" + ori.getVal());
		// 数据恢复
		ori.restoreMemento(storage.getMemento());
		System.out.println("恢复后的数据：" + ori.getVal());
	}
}
