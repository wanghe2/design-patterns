package com.wang.command;

public class DumplingOrder implements Order{
	
	private String name="饺子";
	
	private Cooker cooker;
	
	public DumplingOrder(Cooker cooker) {
		this.cooker=cooker;
	}
	public void downOrder() throws InterruptedException {
		System.err.println("模拟传参------"+name);
		cooker.doCook(name);
	}

}
