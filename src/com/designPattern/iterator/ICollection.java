package com.designPattern.iterator;

public interface ICollection<T> {
	public Iterator iterator();

	// 获得集合元素
	public T get(int i);

	// 获得集合大小
	public int size();

	// 添加元素
	public boolean add(T element);
}
