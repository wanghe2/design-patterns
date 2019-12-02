package com.wang;

import com.wang.impl.ObserverOne;
import com.wang.impl.ObserverThree;
import com.wang.impl.ObserverTwo;
import com.wang.impl.RoleImpl;
import com.wang.inter.IRole;

/**
 * 观察者模式
 * @author wanghe
 *
 */
public class ObServerApp 
{
    public static void main( String[] args )
    {
    	IRole role=new RoleImpl();
    	role.add(new ObserverOne());
    	role.add(new ObserverTwo());
    	role.add(new ObserverThree());
    	role.confirm("今天五点半下班");
    }
}
