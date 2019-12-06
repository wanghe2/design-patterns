package com.wang;

import com.wang.command.Cooker;
import com.wang.command.DumplingOrder;
import com.wang.command.FishOrder;
import com.wang.command.Order;
import com.wang.command.ProkOrder;
import com.wang.command.Waiter;

/**
 * 命令模式(本项目可以撤销请求，将参数化请求作为独立的对象，防止老是请求，没有参数化的情况下，多次请求可能会很乱)
 * @author wanghe
 *
 *命令模式是一种行为设计模式， 它可将请求转换为一个包含与请求相关的所有信息的独立对象。 
 *该转换让你能根据不同的请求将方法参数化、 延迟请求执行或将其放入队列中， 且能实现可撤销操作。
 */
public class CommandApp 
{
    public static void main( String[] args ) throws InterruptedException
    {
    	Cooker cooker=new Cooker();
    	Waiter waiter=new Waiter();
    	System.err.println("第一次，有两人下单");
    	Order order1=new ProkOrder(cooker);
    	Order order2=new FishOrder(cooker);
    	waiter.addOrder(order1);
    	waiter.addOrder(order2);
    	System.err.println("下单后，还没做之前，有一个订单取消了，红烧带鱼换成了饺子");
    	waiter.cancelOrder(order2);
    	Order order3=new DumplingOrder(cooker);
    	waiter.addOrder(order3);
    	waiter.outFood();
    }
    
}
