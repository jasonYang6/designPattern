package com.designPattern.Interpreter;

/**
 * 具体的解释器
 * 
 * @author jason
 * 
 */
public class Minus implements Expression {

	@Override
	public int interpret(Context context) {
		// TODO Auto-generated method stub
		return context.getNum1() - context.getNum2();
	}

}
