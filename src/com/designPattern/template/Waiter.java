package com.designPattern.template;

/**
 * 具体的子类
 * 
 * @author Jason
 *
 */
public class Waiter extends Person {

	@Override // 具体工作
	public void work() {
		System.out.println("去餐厅上班!");

	}

}
