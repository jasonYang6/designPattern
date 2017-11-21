package com.designPattern.bridge;

import org.junit.Test;

public class TestCase {

	@Test
	public void Test() {
		Ability cpu = new AmdCpu();
		IBMComputer ibm = new IBMComputer(cpu);
		DellComputer dell = new DellComputer(cpu);
		try {
			ibm.checkAbility();
			dell.checkAbility();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
