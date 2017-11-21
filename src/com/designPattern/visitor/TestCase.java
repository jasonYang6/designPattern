package com.designPattern.visitor;

import org.junit.Test;

/**
 * 测试类
 * 
 * @author jason
 * 
 */
public class TestCase {
	@Test
	public void test() {
		TextStructure structure = new TextStructure();
		Text computerText = new ComputerText();
		structure.addText(computerText);
		structure.useComputer(new ItEnginner("李红", 1));
		structure.useComputer(new OperationPeason("王伟", 2));

	}
}
