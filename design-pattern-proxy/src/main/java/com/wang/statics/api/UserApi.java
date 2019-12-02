package com.wang.statics.api;

import com.wang.statics.inter.IUser;

public class UserApi {

	private IUser user;
	
	public UserApi(IUser user) {
		this.user=user;
	}
	
	public void doAction() {
		user.introduce();
	}
}
