package com.wang;

import com.wang.composite.JoinInStore;
import com.wang.composite.StoreOrBranch;

/**
 * 组合模式，有 树形结构
 * 
 * 场景：一张卡可以在总部，分店，加盟店使用，那么总部可以刷卡，分店也可以刷卡，加盟店也可以刷卡，
 * 这个属性结构的店面层级关系就明确啦。那么，总店刷卡消费与分店刷卡消费是一样的道理，
 * 那么总店与分店对会员卡的使用也具有一致性。
 * @author wanghe
 *
 */
public class CompositeApp 
{
    public static void main( String[] args )
    {
        StoreOrBranch store = new StoreOrBranch("朝阳总店");
        StoreOrBranch brach = new StoreOrBranch("东城分店");
        JoinInStore jstore = new JoinInStore("海淀加盟店一");
        JoinInStore jstore1 = new JoinInStore("上地加盟店二");

        brach.Add(jstore);
        brach.Add(jstore1);
        store.Add(brach);

        store.PayByCard();
    	
    }
}
