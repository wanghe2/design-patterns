package com.wang.bean;

import com.wang.inter.Pay;

/**
 * 订单
 * @author wanghe
 *
 */
public class Order {
	
	private String amount;
	private String name;
	private Pay pay;
	public Order(String name,String contractAmount) {
		this.setAmount(contractAmount);
		this.name=name;
		System.err.println("项目-"+name+"-立项，项目金额："+contractAmount);
	}
	
	public void setPayWay(Pay pay) {
		this.pay=pay;
	}
	
	public void finish() {
		System.err.println("项目-"+name+"-结项，进行付款");
		pay.pay(amount);
		
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
