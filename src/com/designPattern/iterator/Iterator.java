package com.designPattern.iterator;

public interface Iterator {
	// 向前移动
	public Object previous();

	// 向后移动
	public Object next();

	public Boolean hasNext();

	// 获取第一个元素
	public Object first();

}
