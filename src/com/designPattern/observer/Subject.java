package com.designPattern.observer;

/**
 * 被观察者的接口.我们可以通俗的认为是奶站或者报社需要做的事情
 * 
 * @author Jason
 *
 */
public interface Subject {
	// 添加一个观察者(订购者)
	public void addOserver(Oserver oserver);

	// 删除一个观察者(订购者)
	public void deleteOserver(Oserver oserver);

	// 通知观察者(可以认为送奶或送报)
	public void notifyObserver();

}
