package com.designPattern.visitor;

/**
 * 我们访问记录册的接口(被访问者的接口)
 * 
 * @author jason
 * 
 */
public interface Text {
	/**
	 * 接受外部访问者的方法
	 * 
	 * @param peason
	 */
	public void accept(Peason peason);
}