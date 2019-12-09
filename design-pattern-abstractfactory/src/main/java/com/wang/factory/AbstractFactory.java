package com.wang.factory;

import com.wang.color.Color;
import com.wang.shape.Shape;

/**
 * 工厂类，使用 getShape 方法获取形状类型的对象
 * @author wanghe
 *
 */
public abstract class AbstractFactory {
	
	 public abstract Color getColor(String color);
	 public abstract Shape getShape(String shape) ;
	
}
