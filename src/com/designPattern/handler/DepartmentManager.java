package com.designPattern.handler;

/**
 * 总经理
 * 
 * @author jason
 *
 */
public class DepartmentManager extends AbstractHandler {

	@Override
	public void doTask(String task) {
		switch (task) {
		case "申请材料":
			System.out.println("加薪没门!");
			break;
		default:
			System.out.println(task + "已经上交给总经理");
			handler.doTask(task);
		}
	}

}
