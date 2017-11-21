package com.designPattern.iterator;

public class MyIterator<T> implements Iterator {
	private ICollection<T> collection;// 装元素的集合
	private int pos = -1;// 记录位置

	public MyIterator(ICollection<T> collection) {
		this.collection = collection;
	}

	@Override
	public T previous() { // 向前
		if (pos > 0) {
			pos--;
		}
		return collection.get(pos);
	}

	@Override
	public T next() {
		if (collection.size() - 1 > pos) {
			pos++;
		}
		return collection.get(pos);
	}

	@Override
	public Boolean hasNext() {
		if (collection.size() - 1 > pos) {
			return true;
		}
		return false;
	}

	@Override
	public T first() {
		pos = 0;
		return collection.get(pos);

	}

	public ICollection<T> getCollection() {
		return collection;
	}

	public void setCollection(ICollection<T> collection) {
		this.collection = collection;
	}

	public int getPos() {
		return pos;
	}

	public void setPos(int pos) {
		this.pos = pos;
	}

}
