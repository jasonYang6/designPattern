package com.designPattern.visitor;

/**
 * 具体的访问者
 * 
 * @author jason
 * 
 */
public class OperationPeason implements Peason {
	public OperationPeason(String name, int time) {
		super();
		this.name = name;
		this.time = time;
	}

	private String name;
	private int time;

	@Override
	public void record() {
		System.out.println("运维工程师" + name + "使用服务器" + time + "小时!");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

}
