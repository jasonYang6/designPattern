package com.designPattern.handler;

/**
 * 部门经理
 * 
 * @author jason
 *
 */
public class GeneralManager extends AbstractHandler {

	@Override
	public void doTask(String task) {
		switch (task) {
		case "加薪":
			System.out.println("加薪没门!");
			break;
		default:
			System.out.println(task + "是什么意思?");
		}
	}

}
