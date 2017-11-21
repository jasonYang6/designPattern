package com.designPattern.aggregate;

/**
 * 具体的迭代子对象
 * 
 * @author Jason
 *
 */
public class ConcreteIterator implements Iterator<String> {
	private ConcreteAggregate context;

	public ConcreteIterator(ConcreteAggregate context) {
		this.context = context;
	}

	@Override // 获得长度的对象
	public int getSize() {
		// TODO Auto-generated method stub
		return context.getLength();
	}

}
