package com.designPattern.memento;

/**
 * 原始数据
 * 
 * @author Jason
 *
 */
public class Original {
	String val;

	// 创建副本
	public Memento createMemento() {
		return new Memento(val);
	}

	// 从副本恢复
	public void restoreMemento(Memento memento) {
		this.val = memento.getVal();
	}

	public Original(String val) {
		this.val = val;
	}

	public String getVal() {
		return val;
	}

	public void setVal(String val) {
		this.val = val;
	}
}
