package com.designPattern.template;

/**
 * 抽象出模板方法的父类
 * 
 * @author Jason
 *
 */
public abstract class Person {

	/*
	 * 每天固定的流程
	 */
	public void doTask() {
		System.out.println("起床!");
		work();
		System.out.println("睡觉!");
	}

	// 抽象的工作.具体工作由子类进行完成
	public abstract void work();
}
