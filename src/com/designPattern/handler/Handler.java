package com.designPattern.handler;

/**
 * 责任链链模式的接口
 * 
 * @author jason
 *
 */
public interface Handler {

	/**
	 * 获得下一个请求者
	 * 
	 * @return
	 */
	public Handler getNext();

	/**
	 * 处理任务
	 */
	public void doTask(String task);

	/**
	 * 设置下一个请求者
	 */
	public void setNext(Handler handler);
}
