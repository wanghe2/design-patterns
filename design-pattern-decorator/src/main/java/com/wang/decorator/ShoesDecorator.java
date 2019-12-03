package com.wang.decorator;

public class ShoesDecorator extends Decorator{

	public ShoesDecorator(IPerson person) {
		super(person);
	}

	@Override
	public void introduce() {
		super.introduce();
		System.err.println("我有一双鞋子");
	}
	
}
