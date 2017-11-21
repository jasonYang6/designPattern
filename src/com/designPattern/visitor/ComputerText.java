package com.designPattern.visitor;

/**
 * 服务器使用记录的本子(具体的被访问者)
 * 
 * @author jason
 * 
 */
public class ComputerText implements Text {

	@Override
	public void accept(Peason peason) {
		// TODO Auto-generated method stub
		peason.record();
	}

}
