
package com.designPattern.simpleFactory;

//简单工程模式的核心类,我们可以认为是商贩
public class Factory {

	public static String apple = "apple";
	public static String banana = "banana";

	public Fruit getFruit(String name) {
		Fruit fruit = null;
		if (name.equals(apple)) {
			fruit = new Apple();
		}
		if (name.equals(banana)) {
			fruit = new Banana();
		}
		return fruit;
	}
}



