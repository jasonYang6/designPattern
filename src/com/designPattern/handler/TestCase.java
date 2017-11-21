package com.designPattern.handler;

import org.junit.Test;

/**
 * 测试用例
 * 
 * @author jason
 *
 */
public class TestCase {
	@Test
	public void Test() {
		Handler projectManager = new ProjectManager();
		Handler departmentManager = new DepartmentManager();
		Handler generalManager = new GeneralManager();
		projectManager.setNext(departmentManager);
		departmentManager.setNext(generalManager);
		projectManager.doTask("加薪");
	}

}
