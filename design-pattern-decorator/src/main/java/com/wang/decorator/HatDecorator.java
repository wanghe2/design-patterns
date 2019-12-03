package com.wang.decorator;

public class HatDecorator extends Decorator{

	public HatDecorator(IPerson person) {
		super(person);
	}

	@Override
	public void introduce() {
		super.introduce();
		System.err.println("我有一个帽子");
	}
	
}
