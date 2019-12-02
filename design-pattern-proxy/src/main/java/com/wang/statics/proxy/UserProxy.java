package com.wang.statics.proxy;

import com.wang.statics.inter.IUser;

public class UserProxy implements IUser{

	private IUser user;
	
	public UserProxy() {
		user=new UserAction();
	}
	
	public void introduce() {
		System.err.println("代理人开场白：----下面是正式的实现");
		user.introduce();
		System.err.println("代理人结束语：----实现类执行结束 ");
	}

}
