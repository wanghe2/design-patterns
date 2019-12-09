package com.wang.composite;

import java.util.ArrayList;
import java.util.List;
/**
 * 总店或分店
 * @author wanghe
 *
 */
public class StoreOrBranch extends Storefront{


    //构造函数
    public StoreOrBranch() { }
    public StoreOrBranch(String storeName)
    {
        this.storeName = storeName;
    }
    List<Storefront> myStoreList = new ArrayList<Storefront>();
    //刷卡消费
    public  void PayByCard()
    {
        System.err.println("店面"+storeName+"的积分已累加进该会员卡");
        for (Storefront sf : myStoreList)
        {
            sf.PayByCard();
        }
    }

    /**
     * 增加店面
     */
    public  void Add(Storefront store)
    {
        myStoreList.add(store);
    }

    /**
     * 解除店面
     */
    public  void Remove(Storefront store)
    {
        myStoreList.remove(store);
    }

	
}
