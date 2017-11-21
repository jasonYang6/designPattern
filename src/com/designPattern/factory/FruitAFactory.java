package com.designPattern.factory;

/**
 * 产品A工厂
 * 
 * @author Jason
 *
 */
public class FruitAFactory implements Factory {

	@Override
	public Fruit createProduct() {
		// TODO Auto-generated method stub
		return new FruitA();
	}

}
