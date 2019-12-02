package com.wang;

import com.wang.bean.China;

/**
 * Hello world!
 *
 */
public class SingleApp 
{
    public static void main( String[] args )
    {
        China china1=China.getInstance();
    	china1.setValue("中国华夏");
    	System.err.println(china1.getValue());
    	China china2=China.getInstance();
    	china2.setValue("中华人民共和国");
    	System.err.println(china1.getValue());
    	System.err.println(china2.getValue());
    	china1.setValue("中国");
    	System.err.println(china1.getValue());
    	System.err.println(china2.getValue());
    }
}
