package com.designPattern.flyweight;

/**
 * 可以具体的代指任务物品的基类
 * 
 * @author Jason
 *
 */
public class Goods implements Flyweight {

	private String name;

	public Goods(String name) {
		System.out.println("创建" + name);
		this.name = name;
	}

	@Override
	public void use() {
		System.out.println(name + "被使用");
	}

}
