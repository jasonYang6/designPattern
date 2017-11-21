package com.designPattern.state;

/**
 * 晚上的状态
 * 
 * @author jason
 *
 */
public class EveningState extends AbstractState {
	public static int MIN_TIME = 14;
	public static int MAX_TIME = 24;

	@Override // 晚上做的事情
	public void doAction(Context time) {
		if (MIN_TIME > time.getTime()) {
			time.setState(new AfternoonState());
			time.doThing();
		}
		if (MIN_TIME <= time.getTime() && MAX_TIME > time.getTime()) {
			System.out.println("这是晚上!");
		}
		if (time.getTime() > MAX_TIME) {
			System.out.println("输入的时间有误");
		}
	}
}
