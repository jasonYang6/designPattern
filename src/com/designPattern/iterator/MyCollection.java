package com.designPattern.iterator;

import java.util.Vector;

public class MyCollection<T> implements ICollection<T> {
	private int size;
	private Vector<T> vector;

	@Override
	public Iterator iterator() {
		return new MyIterator<T>(this);
	}

	@Override
	public T get(int i) {
		if (size >= i) {
			return vector.get(i);
		}
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public boolean add(T element) {
		if (vector == null) {
			vector = new Vector<T>();
			size = 0;
		}
		vector.add(element);
		size++;
		return true;
	}

	public int getSize() {
		return size;
	}

	public Vector<T> getVector() {
		return vector;
	}

}
