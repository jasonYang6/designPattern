package com.designPattern.adapter;

/**
 * 测试类
 * 
 * @author jason
 *
 */
public class Main {

	// 测试方法
	public static void main(String[] args) {
		// 原始的功能
		Source source = new Source();
		source.oldMethod();
		// 转接之后的功能
		Targetable target = new Adapter();
		target.method();
	}

}
