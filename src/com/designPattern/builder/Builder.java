package com.designPattern.builder;

/**
 * 建造模式的核心接口,规范建造的内容
 * 
 * @author Jason
 *
 */
public interface Builder {
	// 建造模块A
	public abstract void buildPartA();

	// 建造模块B
	public abstract void buildPartB();

	// 得到产品
	public abstract Product getProduct();
}
