package com.wang.inter;
/**
 * 策略模式，其实就是把行为（算法）封装成类，并且提供公共接口，保证算法对象可以相互替换
 * @author wanghe
 *
 */
public interface Pay {
	void pay(String amount);
}
