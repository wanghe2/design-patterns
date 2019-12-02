
package com.wang;

import com.wang.dymatics.PersonProxy;
import com.wang.statics.api.UserApi;
import com.wang.statics.inter.IUser;
import com.wang.statics.proxy.UserAction;
import com.wang.statics.proxy.UserProxy;

public class ProxyApp {
    public static void main( String[] args )
    {
    	//staticProxy();
    	dymaticProxy();
    }
    
    public static void staticProxy() {//静态代理
    	System.err.println("--------普通方式--------------");
    	UserApi userApi=new UserApi(new UserAction());
    	userApi.doAction();
    	System.err.println("\n--------代理方式--------------");
    	UserApi userApi1=new UserApi(new UserProxy());
    	userApi1.doAction();
    }
    
    public static void dymaticProxy() {//动态代理
    	PersonProxy proxy=new PersonProxy(IUser.class, new UserAction());
    	IUser user=(IUser)proxy.getProxy();
    	user.introduce();
    }
}
