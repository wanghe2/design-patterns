package com.wang.impl;

import com.wang.inter.IObserver;

public class ObserverThree implements IObserver{

	public void doAction(String data) {
		System.err.println("\n大家好，我是三号号观察员，我接收到了消息："+data+" ;我反对发布者的决定 \n");
	}

}
