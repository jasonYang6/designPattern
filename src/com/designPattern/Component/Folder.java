package com.designPattern.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * 模拟系统中文件夹的存在
 * 
 * @author Jason
 *
 */
public class Folder implements Component {

	public String name;
	public List<Component> folder = new ArrayList<Component>();

	public Folder(String name) {
		if (null == name || name.trim().equals(name)) {
			this.name = "新建文件夹";
			return;
		}
		this.name = name;
	}

	/********* 自身拥有的特殊方法 start ******************/
	public void add(Component component) {
		if (component != null) {
			folder.add(component);
		}
	}

	/********* 自身拥有的特殊方法 end ******************/
	@Override
	public void open() {
		System.out.println("open " + name + "文件夹!");
		// 实现打开的操作
		for (Component component : folder) {
			component.open();
		}

	}

	@Override
	public void rename(String name) {
		System.out.println("rename " + this.name + "文件夹为" + name);
		this.name = name;
	}

	@Override
	public void delete() {
		System.out.println("delete " + name + "文件夹!");
		// 删除文件的内容
		for (Component component : folder) {
			component.delete();
		}
		// 实现删除的操作

	}

}
