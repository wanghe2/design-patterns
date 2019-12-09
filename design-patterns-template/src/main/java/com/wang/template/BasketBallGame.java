package com.wang.template;

public class BasketBallGame extends Game{

	@Override
	void initialize() {
		System.err.println("篮球游戏初始化加载......");
	}

	@Override
	void startPlay() {
		System.err.println("篮球游戏正式开始------");
	}

	@Override
	void endPlay() {
		System.err.println("篮球游戏挂机结束......");
	}

}
