package com.designPattern.Component;

import org.junit.Test;

/**
 * 测试类
 * 
 * @author Jason
 *
 */
public class TestCase {
	@Test
	public void Test() {
		Folder folder = new Folder("bool");
		File file1 = new File("java编程思想.txt");
		File file2 = new File("算法与设计.txt");
		File file3 = new File("设计模式.txt");
		folder.add(file1);
		folder.add(file2);
		folder.add(file3);
		folder.rename("study");
		folder.open();

	}
}
