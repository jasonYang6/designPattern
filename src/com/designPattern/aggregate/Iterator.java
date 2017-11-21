package com.designPattern.aggregate;

/**
 * 迭代子模式的接口
 * 
 * @author Jason
 *
 */
public interface Iterator<T> {

	/**
	 * 得到对象的大小
	 * 
	 * @return
	 */
	public int getSize();
	// 下面也可以写其他的一些共有的方法.例如遍历,得到下一个,指定位置的元素等等

}
