package com.designPattern.handler;

/**
 * 项目经理
 * 
 * @author jason
 *
 */
public class ProjectManager extends AbstractHandler {

	@Override
	public void doTask(String task) {
		switch (task) {
		case "请假":
			System.out.println("同意请假!");
			break;
		case "调休":
			System.out.println("同意调休!");
			break;
		default:
			System.out.println(task + "已经上交给部门经理");
			handler.doTask(task);// 其他事情超出权限的事情交给上级
		}
	}

}
