package com.designPattern.handler;

public abstract class AbstractHandler implements Handler {
	protected Handler handler;

	/**
	 * 获得下一个请求者
	 * 
	 * @return
	 */
	@Override
	public Handler getNext() {
		return handler;
	}

	/**
	 * 设置下一个请求者
	 */
	@Override
	public void setNext(Handler handler) {
		this.handler = handler;
	}
}
