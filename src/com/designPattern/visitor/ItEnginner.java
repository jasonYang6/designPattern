package com.designPattern.visitor;

public class ItEnginner implements Peason {
	private String name;
	private int time;

	@Override
	public void record() {
		System.out.println("it工程师" + name + "使用服务器" + time + "小时!");

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ItEnginner(String name, int time) {
		super();
		this.name = name;
		this.time = time;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

}
