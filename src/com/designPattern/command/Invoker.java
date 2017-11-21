/**
 * 
 */
package com.designPattern.command;

/**
 * 发布命令者
 * 
 * @author Jason
 *
 */
public class Invoker {
	private Command command;

	public Invoker(Command command) {
		this.command = command;
	}

	public void action() {
		System.out.println("发布命令!");
		command.execute();
	}

}
