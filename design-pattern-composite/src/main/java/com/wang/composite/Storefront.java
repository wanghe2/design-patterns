package com.wang.composite;
/**
 * 店铺（抽象类）
 * @author wanghe
 *
 */
public abstract class Storefront
{   
    protected String storeName ;
    //添加店面
    public abstract void Add(Storefront store);
    //删除店面
    public abstract void Remove(Storefront store);

    //定义所有部件公用的行为 刷卡行为
    public abstract void PayByCard();
}