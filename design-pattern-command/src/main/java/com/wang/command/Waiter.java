package com.wang.command;
/**
 * 服务员 （命令调用者）
 * @author wanghe
 *
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Waiter {
	
	List<Order>orders=new ArrayList<Order>();
	
	public void addOrder(Order order) {//增加订单
		orders.add(order);
	}
	
	public void cancelOrder(Order order) {//取消订单
		Iterator<Order>iterator_orders= orders.iterator();
		while(iterator_orders.hasNext()) {
			if(iterator_orders.next()==order) {
				iterator_orders.remove();
			}
		}
	}
	
	public void outFood() throws InterruptedException {//出餐
		for(Order order:orders) {
			order.downOrder();
		}
		orders.clear();
	}
}
