package com.designPattern.facade;

//主板(模拟外观模式的核心)
public class MainBoard_Faced {
	CDDriver cd = new CDDriver();
	Cpu cpu = new Cpu();
	Memory memory = new Memory();

	// 主板的启动(也在外观模式的核心方法)
	public void startUp() {
		System.out.println("MainBoard startUp");
		cd.startUp();
		cpu.startUp();
		memory.startUp();
	}
}