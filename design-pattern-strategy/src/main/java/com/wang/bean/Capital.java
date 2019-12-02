package com.wang.bean;

public class Capital {
	
	private static Double weChat=100.0;

	private static Integer cash=500;

	private static Integer card=30000;

	public static Double getWeChat() {
		return weChat;
	}

	public static void setWeChat(Double weChat) {
		Capital.weChat = weChat;
	}

	public static Integer getCash() {
		return cash;
	}

	public static void setCash(Integer cash) {
		Capital.cash = cash;
	}

	public static Integer getCard() {
		return card;
	}

	public static void setCard(Integer card) {
		Capital.card = card;
	}
}
