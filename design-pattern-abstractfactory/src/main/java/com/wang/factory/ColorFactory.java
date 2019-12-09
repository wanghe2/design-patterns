package com.wang.factory;

import com.wang.color.Blue;
import com.wang.color.Color;
import com.wang.color.Green;
import com.wang.color.Red;
import com.wang.shape.Shape;

public class ColorFactory extends AbstractFactory {
    
	   @Override
	   public Shape getShape(String shapeType){
	      return null;
	   }
	   
	   @Override
	   public Color getColor(String color) {
	      if(color == null){
	         return null;
	      }        
	      if(color.equalsIgnoreCase("RED")){
	         return new Red();
	      } else if(color.equalsIgnoreCase("GREEN")){
	         return new Green();
	      } else if(color.equalsIgnoreCase("BLUE")){
	         return new Blue();
	      }
	      return null;
	   }
	}