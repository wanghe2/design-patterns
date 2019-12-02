package com.wang;

import com.wang.action.CardPay;
import com.wang.action.CashPay;
import com.wang.bean.Order;

/**
 * Hello world!
 *
 */
public class StrategyApp 
{
    public static void main( String[] args )
    {
    	Order order1=new Order("上海财经人员外包服务合同", "200");
    	selPay(order1);
    	order1.finish();
    	Order order2=new Order("一卡通智慧校园V5", "8000");
    	selPay(order2);
    	order2.finish();
    }
    /**
     * 策略模式中判断使用那种付款方式(如果有其他的付款方式，只需要改一下这里判断的规则，新增接口实现，方便扩展)
     * @param order
     */
    public static void selPay(Order order) {
    	if(Integer.parseInt(order.getAmount())<500) {
    		order.setPayWay(new CashPay());
    	}else {
    		order.setPayWay(new CardPay());
    	}
    	
    }
    
}
