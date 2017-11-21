package com.designPattern.adapter;

/**
 * 最终的目的
 * 
 * @author jason
 *
 */
public class ConcreteTarget implements Targetable {

	@Override
	public void method() {
		System.out.println("我把两孔插座转换为三孔插座!");
	}
}
