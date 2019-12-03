package com.wang;

import java.io.BufferedWriter;
import java.util.List;
import java.util.Map;

import com.wang.decorator.ClothesDecorator;
import com.wang.decorator.Decorator;
import com.wang.decorator.HatDecorator;
import com.wang.decorator.Person;
import com.wang.decorator.ShoesDecorator;
import com.wang.word.WordFilter;
import com.wang.word.WordStat;

/**
 * 装饰者模式 （ 一个人（被装饰者），有衣服、帽子、鞋子等多种装饰品，且可以扩展）
 * @author wanghe
 *
 */
public class DecoratorApp 
{
    public static void main( String[] args ) throws Exception
    {	
    	/**
    	 *可以扩展多个装饰者，还易于扩展
    	 */
    	Decorator decorator=new ClothesDecorator(new ShoesDecorator(new HatDecorator(new Person()) ));
    	decorator.introduce();
    }
    
    
    /**
     * 分词并统计词频，（与设计模式无关）
     * @throws Exception
     */
    public static void statWord() throws Exception {
    	String string="不选择公共采购合同出库，只需填写转出设备的数量，生成采购合同，生成采购合同信息：单位（上海树维）、其他信息读库存表。收票金额，付款金额默认为100%，默认审批通过。\r\n" + 
    				  "选择公共采购合同出库，填写转出库存数量，生成新采购合同，合同单位（从共采购合同中读取），其他信息读库存表，需根据收票金额默认100%，付款根据公共采购合同写入（付款未完成可在新生成的采购合同中提交付款），默认审批通过。\r\n" + 
    				  "被选择的公共采购合同，设备数量，金额，等信息根据所填写的数量减少，已出库数量。" ;
    	List<String>strList=WordFilter.getStrList(string);
    	Map<String,Integer>wordMaps=WordStat.statFrequency(strList);
    	for(String key:wordMaps.keySet()) {
    		System.err.println(key+"--"+wordMaps.get(key)+"次");
    	}
    }
    
}
