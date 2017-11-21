package com.designPattern.Component;

/**
 * 文件的实现
 * @author Jason
 *
 */
public class File implements Component {

	public String name;

	public File(String name) {
		if (null == name || name.trim().equals(name)) {
			this.name = "新建文件";
			return;
		}
		this.name = name;
	}

	@Override
	public void open() {
		System.out.println("open " + name + "文件!");
		// 实现打开的操作

	}

	@Override
	public void rename(String name) {
		System.out.println("rename " + this.name + "文件为" + "name");
		this.name = name;
	}

	@Override
	public void delete() {
		System.out.println("delete " + name + "文件!");
		// 实现删除的操作

	}

}
