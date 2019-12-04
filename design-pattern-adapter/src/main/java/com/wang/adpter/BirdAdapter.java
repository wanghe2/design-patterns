package com.wang.adpter;

public class BirdAdapter extends Bird{

	private Dog dog;
	
	public BirdAdapter(Dog dog) {
		this.dog=dog;
	}
	
	@Override
	public void fly() {
		System.err.println("我有适配器，为dog提供绿色通道");
		dog.run();
	}
}
