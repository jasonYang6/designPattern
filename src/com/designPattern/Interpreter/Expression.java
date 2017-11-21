package com.designPattern.Interpreter;

/**
 * 解释器的接口
 * 
 * @author jason
 * 
 */
public interface Expression {
	// 解释器的方法
	public int interpret(Context context);
}