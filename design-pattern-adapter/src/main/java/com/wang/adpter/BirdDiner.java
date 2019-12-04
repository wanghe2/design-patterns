package com.wang.adpter;

public class BirdDiner {
	public void eat(Bird bird) {
		System.err.println("欢迎来到餐厅，吃饭前先飞一圈才可以吃饭");
		bird.fly();
		System.err.println("可以吃饭了");
	}
	
}
