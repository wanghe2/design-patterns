package com.wang.command;
/**
 * 红烧带鱼订单(具体的命令角色)
 * @author wanghe
 *
 */
public class FishOrder implements Order{

	private String name="红烧带鱼";
	
	private Cooker cooker;
	
	public FishOrder(Cooker cooker) {
		this.cooker=cooker;
	}
	
	public void downOrder() throws InterruptedException {

		System.err.println("模拟传参------"+name);
		cooker.doCook(name);
	
	}

}
