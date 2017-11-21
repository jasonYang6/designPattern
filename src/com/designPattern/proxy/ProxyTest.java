package com.designPattern.proxy;

import org.junit.Test;


public class ProxyTest {
	
	@Test
	public void simplyTest(){
		Sourceable proxy = new Proxy();
		proxy.method();
				
	}
}
