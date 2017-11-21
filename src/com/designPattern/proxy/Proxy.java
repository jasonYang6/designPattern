package com.designPattern.proxy;

public class Proxy implements Sourceable {
	Source source;

	public Proxy() {
		super();
		source = new Source();
	}

	@Override
	public void method() {
		// TODO Auto-generated method stub
		before();
		source.method();
		after();

	}

	// 代理前可以进行的操作
	public void before() {
		System.out.println("before proxy!");
	}

	// 代理后进行的方法
	public void after() {
		System.out.println("after proxy!");
	}

}
