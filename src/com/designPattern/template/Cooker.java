package com.designPattern.template;

/**
 * 具体的子类
 * 
 * @author Jason
 *
 */
public class Cooker extends Person {

	@Override // 具体的工作
	public void work() {
		System.out.println("去厨房上班!");

	}

}
