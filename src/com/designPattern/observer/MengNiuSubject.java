package com.designPattern.observer;

import java.util.HashSet;
import java.util.Set;

/**
 * 具体的被观察者
 * 
 * @author Jason
 *
 */
public class MengNiuSubject implements Subject {
	private Set<Oserver> oservers;

	/*
	 * 构造函数,实例化观察者容器
	 */
	public MengNiuSubject() {
		oservers = new HashSet<Oserver>();
	}

	@Override // 添加观察者
	public void addOserver(Oserver oserver) {
		oservers.add(oserver);

	}

	@Override
	public void deleteOserver(Oserver oserver) {
		oservers.remove(oserver);

	}

	@Override // 通知观察者
	public void notifyObserver() {
		// 以下语句只有java8以上版本才能编译通过
		oservers.forEach(n -> {
			n.accept();
		});

	}

}
