package com.wang.impl;

import com.wang.inter.IObserver;

public class ObserverTwo implements IObserver{
	
	public void doAction(String data) {
		System.err.println("\n大家好，我是二号观察员，我接收到了消息："+data+" ;我同意发布者的决定 \n");	
	}

}
