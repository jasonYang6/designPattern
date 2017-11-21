package com.designPattern.flyweight;

import java.util.Hashtable;

/**
 * 物品的工厂类,负责物品的维护
 * 
 * @author Jason
 *
 */
public class GoodsFactory {
	// 负责对物品的存储
	private Hashtable<String, Flyweight> flyweights = new Hashtable<String, Flyweight>();

	// 取得对应的物品,如果没有则进行创建
	public Flyweight getFlyweight(String name) {
		if (name == null) {
			return null;
		}
		Flyweight flyweight = flyweights.get(name);
		if (flyweight == null) {
			flyweight = new Goods(name);
			flyweights.put(name, flyweight);
		}
		return flyweight;
	}

	public int getSize() {
		return flyweights.size();
	}

}
