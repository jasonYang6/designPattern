package com.designPattern.bridge;

public class IBMComputer extends AbstractComputer {

	public IBMComputer(Ability ability) {
		super(ability);
	}

	@Override
	public void checkAbility() throws Exception {
		if (ability == null) {
			throw new Exception("ability cann`t empty!");
		}
		System.out.println("IBM笔记本" + ability.showAbility());
	}

}
