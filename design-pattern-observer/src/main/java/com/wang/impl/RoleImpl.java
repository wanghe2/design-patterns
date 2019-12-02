package com.wang.impl;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.wang.inter.IObserver;
import com.wang.inter.IRole;
/**
 * 观察者的增加、删除以及通知观察者的具体事情，都是这个类来实现
 * @author wanghe
 *
 */
public class RoleImpl implements IRole{

	List<IObserver> observerList=new ArrayList<IObserver>();
	
	public void add(IObserver observer) {
		observerList.add(observer);
	}

	public void delete(IObserver observer) {
		Iterator<IObserver>iterators= observerList.iterator();
		while(iterators.hasNext()) {
			if(iterators.next()==observer) {
				iterators.remove();
			}
		}
	}

	public void confirm(String data) {
		System.err.println("我是广播员，现在发布通知----"+data);
		for(IObserver observer:observerList) {
			observer.doAction(data);
		}
	}

}
