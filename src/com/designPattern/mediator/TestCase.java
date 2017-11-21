package com.designPattern.mediator;

import org.junit.Test;

/**
 * 测试类
 * 
 * @author jason
 * 
 */
public class TestCase {

	@Test
	public void test() {
		LianJiaMediator mediator = new LianJiaMediator();
		LandLord landLord = new LandLord(mediator, "房东");
		Renter renter = new Renter(mediator, "租客");
		mediator.setLandLord(landLord);
		mediator.setRenter(renter);
		renter.sendMessage("有房子出租吗?");
		landLord.sendMessage("有很多空的房子!");
	}
}
