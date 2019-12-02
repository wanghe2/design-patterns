package com.wang.inter;
/**
 * 对 一系列观察者进行 添加、删除、通知
 * @author wanghe
 *
 */
public interface IRole {
	void add(IObserver observer);
	
	void delete(IObserver observer);
	
	void confirm(String data);
}
