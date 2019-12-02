package com.wang.statics.proxy;

import com.wang.statics.inter.IUser;
/**
 * 接口真正的实现类 ，代理类其实就是对这个类进行代理
 * @author wanghe
 *
 */
public class UserAction implements IUser{

	public void introduce() {
		System.err.println("i am a person ,i introduce myself to all of you");
	}

}
