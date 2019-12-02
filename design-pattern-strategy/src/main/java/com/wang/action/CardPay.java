package com.wang.action;

import com.wang.bean.Capital;
import com.wang.inter.Pay;

/**
 * 信用卡支付
 * @author wanghe
 *
 */
public class CardPay implements Pay{

	public void pay(String amount) {
		System.err.println("信用卡支付，支付数额为"+amount);
		Capital.setCard(Capital.getCard()-Integer.parseInt(amount));
		System.err.println("已付款，信用卡余额"+Capital.getCard());
	}

}
