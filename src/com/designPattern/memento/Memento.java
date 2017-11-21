package com.designPattern.memento;

/**
 * 备忘录()
 * 
 * @author Jason
 *
 */
public class Memento {
	private String val;

	public Memento(String val) {
		this.val = val;
	}

	public String getVal() {
		return val;
	}

	public void setVal(String val) {
		this.val = val;
	}

}
