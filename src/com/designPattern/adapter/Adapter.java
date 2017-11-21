package com.designPattern.adapter;

/**
 * 适配器的实现类
 * 
 * @author jason
 *
 */
public class Adapter extends Source implements Targetable {
	/**
	 * 通过Adaptee实现方法(这样的写法为类适配),如果将target的实例化通过构造函数对象传入为对象适配
	 */
	private ConcreteTarget target = new ConcreteTarget();

	@Override
	public void method() {
		target.method();
	}

}
