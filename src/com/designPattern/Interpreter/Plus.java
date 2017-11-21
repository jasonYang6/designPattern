package com.designPattern.Interpreter;

/**
 * 具体的解释器
 * 
 * @author jason
 * 
 */
public class Plus implements Expression {

	@Override
	public int interpret(Context context) {
		return context.getNum1() + context.getNum2();
	}

}