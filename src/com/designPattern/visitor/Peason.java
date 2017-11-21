package com.designPattern.visitor;

/**
 * 人员的接口
 * 
 * @author jason
 * 
 */
public interface Peason {

	// 人员登记操作记录(原本对文本进行记录是在text进行的方法,通过此方法将任务由Peason完成)
	public void record();// 优势:不同的人完成自己的记录.当有新的人时.不用修改text
}