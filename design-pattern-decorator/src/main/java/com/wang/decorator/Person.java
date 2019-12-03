package com.wang.decorator;

public class Person implements IPerson{

	@Override
	public void introduce() {
		
		System.err.println("我是一名普通工作人员，我的名字叫王贺，我是一个被修饰者");
		
	}

}
