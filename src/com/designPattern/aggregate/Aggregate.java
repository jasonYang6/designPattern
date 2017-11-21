package com.designPattern.aggregate;

/**
 * 工厂方法
 * 
 * @author Jason
 *
 */
public interface Aggregate<T> {
	// 创建迭代子模式的对象的接口
	public Iterator<T> createIterator();
}
