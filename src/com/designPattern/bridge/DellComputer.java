package com.designPattern.bridge;

public class DellComputer extends AbstractComputer {

	public DellComputer(Ability ability) {
		super(ability);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void checkAbility() throws Exception {
		if (ability == null) {
			throw new Exception("ability cann`t empty!");
		}
		System.out.println("Dell笔记本" + ability.showAbility());
	}

}
