package com.designPattern.single;

/**
 * 回收站(单例模式的核心)
 */
public class Recyle {
	/**
	 * 此处将Recyle实例化的话为饿汉式,eg:Recyle recyle = new Recyle();
	 */
	private static Recyle recyle;// 对外提供自身的实例

	// 必须保证构造函数私有,防止外部实例化该函数
	private Recyle() {
	}

	// 对外提供实例的方法
	public static synchronized Recyle getInstance() {
		if (recyle == null) {
			recyle = new Recyle();// 此为懒汉式.线程安全,去掉synchronized线程不安全
		}
		return recyle;
	}

}
