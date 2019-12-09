package com.wang;

import com.wang.template.BasketBallGame;
import com.wang.template.FootballGame;
import com.wang.template.Game;

public class TemplateApp 
{
    public static void main( String[] args ) throws InterruptedException
    {
    	 Game game = new BasketBallGame();
         game.play();
         Thread.sleep(2000);
         System.err.println(" ");
         game = new FootballGame();
         game.play();      
    	
    }
}
