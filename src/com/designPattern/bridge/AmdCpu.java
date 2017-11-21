package com.designPattern.bridge;

/**
 * Amdcpu的计算性能
 * 
 * @author jason
 * 
 */
public class AmdCpu implements Ability {

	@Override
	public String showAbility() {
		return "Amd性能一般!";

	}

}