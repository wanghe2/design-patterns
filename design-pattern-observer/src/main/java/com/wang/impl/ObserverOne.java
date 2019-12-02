package com.wang.impl;

import com.wang.inter.IObserver;

public class ObserverOne implements IObserver{

	public void doAction(String data) {
		System.err.println("\n大家好，我是一号观察员，我接收到了消息："+data+" ;我对发布者的决定 持保留意见\n");
	}

}
