package com.designPattern.state;

/**
 * 早上的状态
 * 
 * @author jason
 *
 */
public class MorningState extends AbstractState {
	public static int MIN_TIME = 0;
	public static int MAX_TIME = 10;

	@Override
	public void doAction(Context time) {// 早上做的的事情
		if (time.getTime() < MIN_TIME) {
			System.out.println("请输入正确的时间!");
			return;
		}
		if (MIN_TIME <= time.getTime() && MAX_TIME > time.getTime()) {
			System.out.println("这是早上!");
		} else {
			time.setState(new AfternoonState());
			time.doThing();
		}
	}

}
