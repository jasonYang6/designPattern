package com.designPattern.aggregate;

/**
 * 具体的聚集角色类
 * 
 * @author Jason
 *
 */
public class ConcreteAggregate implements Aggregate<String> {
	String value;

	public ConcreteAggregate(String value) {
		this.value = value;
	}

	@Override//创建迭代子对象
	public Iterator<String> createIterator() {
		// TODO Auto-generated method stub
		return new ConcreteIterator(this);
	}

	public int getLength() {
		if (value == null) {
			return 0;
		} else {
			return value.length();
		}
	}

}
