package com.designPattern.mediator;

/**
 * 具体的中介结构
 * 
 * @author jason
 * 
 */
public class LianJiaMediator implements Mediator {
	private LandLord landLord;
	private Renter renter;

	/**
	 * FIXME 待优化,如果有多个user用户通用mediator必然会造成代码臃肿!
	 */
	@Override
	public void declare(User dis, String message) {
		if (dis instanceof LandLord) {
			renter.acceptMessage(message);
		} else {
			landLord.acceptMessage(message);
		}
	}

	public LandLord getLandLord() {
		return landLord;
	}

	public void setLandLord(LandLord landLord) {
		this.landLord = landLord;
	}

	public Renter getRenter() {
		return renter;
	}

	public void setRenter(Renter renter) {
		this.renter = renter;
	}

}