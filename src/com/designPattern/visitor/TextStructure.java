package com.designPattern.visitor;

import java.util.LinkedList;
import java.util.List;

/**
 * 对人员进行管理的类
 * 
 * @author jason
 * 
 */
public class TextStructure {
	List<Text> texts = new LinkedList<Text>();

	/**
	 * 对访问者进行遍历
	 */
	public void useComputer(Peason peason) {
		for (Text test : texts) {
			test.accept(peason);
		}
	}

	/**
	 * 清除访问者
	 */
	public void clearText() {
		texts.clear();
	}

	/**
	 * 添加访问者
	 * 
	 * @param peason
	 */
	public void addText(Text text) {
		texts.add(text);
	}
}