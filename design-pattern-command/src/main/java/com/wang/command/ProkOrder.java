package com.wang.command;
/**
 * 红烧肉订单
 * @author wanghe
 *
 */
public class ProkOrder implements Order{
	
	private String name="红烧肉";
	
	private Cooker cooker;
	
	public ProkOrder(Cooker cooker) {
		this.cooker=cooker;
	}
	
	public void downOrder() throws InterruptedException {

		System.err.println("模拟传参------"+name);
		cooker.doCook(name);
	
	}

}
