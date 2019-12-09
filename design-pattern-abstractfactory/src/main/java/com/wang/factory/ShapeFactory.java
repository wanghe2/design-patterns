package com.wang.factory;

import com.wang.color.Color;
import com.wang.shape.Circle;
import com.wang.shape.Rectangle;
import com.wang.shape.Shape;
import com.wang.shape.Square;

public class ShapeFactory extends AbstractFactory{
	public Shape getShape(String shapeType){
	      if(shapeType == null){
	         return null;
	      }        
	      if(shapeType.equalsIgnoreCase("CIRCLE")){
	         return new Circle();
	      } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
	         return new Rectangle();
	      } else if(shapeType.equalsIgnoreCase("SQUARE")){
	         return new Square();
	      }
	      return null;
	   }
	   
	   @Override
	   public Color getColor(String color) {
	      return null;
	   }  
}
