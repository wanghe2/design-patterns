package com.wang;

import com.wang.adpter.Bird;
import com.wang.adpter.BirdAdapter;
import com.wang.adpter.BirdDiner;
import com.wang.adpter.Dog;

/**
 * 适配器模式
 * 有一个  餐厅dinner，只对 bird （可以fly） 开放 ，现在dog （只能run）也想进去吃饭 ，但是 这个餐厅只针对bird ，可以借助适配器
 * @author wanghe
 *
 */
public class AdapterApp 
{
    public static void main( String[] args )
    {
    	Bird bird=new Bird();
    	BirdDiner birdDiner=new BirdDiner();
    	birdDiner.eat(bird);
    	Bird birdadapter=new BirdAdapter(new Dog());
    	birdDiner.eat(birdadapter);
    }
}
