package com.wang.inter;
/**
 * 观察员 抽象接口 (通知后做成回应，也可认为是监听器)
 * @author wanghe
 *
 */
public interface IObserver {

	public void doAction(String data);
	
}
