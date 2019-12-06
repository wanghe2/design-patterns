package com.wang.command;
/**
 * 厨师  （接收者（具体执行命令的角色））
 * @author wanghe
 *
 */
public class Cooker {
	
	public void doCook(String name) throws InterruptedException {
		System.err.println("准备"+name+"食材");
		Thread.sleep(2000);
		System.err.println("香喷喷的"+name+"出锅了");
	}
	
}
