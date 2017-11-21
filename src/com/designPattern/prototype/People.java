package com.designPattern.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

//需要被复制的对象
public class People implements Serializable, Cloneable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private int age;
	private List<String> duties;

	@Override
	// 浅克隆(自身的值属性[int,double,string,char,long,boolean,属性])
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	// 深克隆
	public Object deepClone() throws ClassNotFoundException, IOException {
		ByteArrayOutputStream bo = new ByteArrayOutputStream();
		ObjectOutputStream oo = new ObjectOutputStream(bo);
		oo.writeObject(this);
		// 从流里读出来
		ByteArrayInputStream bi = new ByteArrayInputStream(bo.toByteArray());
		ObjectInputStream oi = new ObjectInputStream(bi);
		return (oi.readObject());
	}

	public People(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void addDuty(String duty) {
		if (duties == null) {
			duties = new LinkedList<String>();
		}
		if (duty == null || duty.trim().equals("")) {
			return;
		}
		duties.add(duty);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<String> getDuties() {
		return duties;
	}

	public void setDuties(List<String> duties) {
		this.duties = duties;
	}

	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("name:" + name);
		buffer.append(", age:" + age);
		buffer.append(", work:");
		duties.forEach(work -> {
			buffer.append(work+" ");
		});
		return buffer.toString();
	}

}
