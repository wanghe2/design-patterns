package com.wang.composite;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * 加盟店（也是组合模式中执行的最小单位，即树叶）
 * @author wanghe
 *
 */
public class JoinInStore extends Storefront{

    //构造函数
    public JoinInStore() { }
    public JoinInStore(String storeName)
    {
        this.storeName = storeName;
    }
    //刷卡消费
    public  void PayByCard()
    {
        System.err.println("店面"+storeName+"的积分已累加进该会员卡");
    }

    /**
     * add 和 remove 抛异常，说明没有子节点
     */
    public  void Add(Storefront store)
    {
        throw new NotImplementedException();
    }

    public  void Remove(Storefront store)
    {
        throw new NotImplementedException();
    }

}
