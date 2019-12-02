package com.wang.action;

import com.wang.bean.Capital;
import com.wang.inter.Pay;

/**
 * 现金付款
 * @author wanghe
 *
 */
public class CashPay implements Pay{

	public void pay(String amount) {
		System.err.println("现金支付，支付数额为"+amount);
		Capital.setCash(Capital.getCash()-Integer.parseInt(amount));
		System.err.println("已付款，现金余额"+Capital.getCash());
	}
	
}
