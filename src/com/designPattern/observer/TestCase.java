package com.designPattern.observer;

import org.junit.Test;

/**
 * 测试用例
 * 
 * @author Jason
 *
 */
public class TestCase {
	@Test
	public void test() {
		Oserver zhangsan = new CustomerOserver("张三");
		Oserver lisi = new CustomerOserver("李四");
		Subject mengniu = new MengNiuSubject();
		mengniu.addOserver(zhangsan);
		mengniu.addOserver(lisi);
		mengniu.notifyObserver();
	}

}
