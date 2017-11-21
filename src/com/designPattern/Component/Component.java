package com.designPattern.Component;

/**
 * 文件和文件夹共有的抽象接口
 * 
 * @author Jason
 *
 */
public interface Component {
	public void open();// 文件打开抽象方法

	public void rename(String name);// 文件重命名抽象方法

	public void delete();// 文件删除的方法
}
