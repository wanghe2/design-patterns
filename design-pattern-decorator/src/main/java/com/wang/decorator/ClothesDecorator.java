package com.wang.decorator;

public class ClothesDecorator extends Decorator{

	public ClothesDecorator(IPerson person) {
		super(person);
	}

	@Override
	public void introduce() {
		super.introduce();
		System.err.println("我有一件衣服");
	}
	
}
