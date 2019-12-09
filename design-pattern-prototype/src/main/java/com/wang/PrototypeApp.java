package com.wang;

import com.wang.prototype.Shape;
import com.wang.prototype.ShapeCache;

/**
 * 原型模式
 *
 */
public class PrototypeApp 
{
    public static void main( String[] args ){
    	 ShapeCache.loadCache();
    	 
         Shape clonedShape = (Shape) ShapeCache.getShape("1");
         System.out.println("Shape : " + clonedShape.getType()+"	"+clonedShape);        
    
         Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
         System.out.println("Shape : " + clonedShape2.getType()+"	"+clonedShape2);        
    
         Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
         System.out.println("Shape : " + clonedShape3.getType()+"	"+clonedShape3); 
         
         Shape clonedShape4 = (Shape) ShapeCache.getShape("1");
         System.out.println("Shape : " + clonedShape.getType()+"	"+clonedShape4);
    }
}
