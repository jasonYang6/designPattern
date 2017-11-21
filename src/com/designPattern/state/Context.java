package com.designPattern.state;

/**
 * 状态管理的容器
 * 
 * @author jason
 *
 */
public class Context {
	public State state;
	public int time;

	public Context(int time) {
		super();
		this.state = new MorningState();// 默认为早上状态
		this.time = time;
	}

	public void doThing() {
		state.doAction(this);
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

}
