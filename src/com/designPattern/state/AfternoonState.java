package com.designPattern.state;

/**
 * 下午的状态
 * 
 * @author jason
 *
 */
public class AfternoonState extends AbstractState {
	public static int MIN_TIME = 10;
	public static int MAX_TIME = 14;

	@Override // 下午应该做的事情
	public void doAction(Context time) {
		if (MIN_TIME > time.getTime()) {
			time.setState(new MorningState());
			time.doThing();
		}
		if (MIN_TIME <= time.getTime() && MAX_TIME > time.getTime()) {
			System.out.println("这是中午!");
		}
		if (MAX_TIME < time.getTime()) {
			time.setState(new EveningState());
			time.doThing();
		}
	}
}
