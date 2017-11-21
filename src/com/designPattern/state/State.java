package com.designPattern.state;

/**
 * 状态模式的接口
 * 
 * @author Jason
 *
 */
public interface State {
	// 每个状态需要完成任务的接口
	public void doAction(Context time);
}
