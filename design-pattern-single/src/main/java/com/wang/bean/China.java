package com.wang.bean;

public class China {
	
	private static China china=null;
	
	private String value;

	private China() {
		
	}
	
	public synchronized static China getInstance() {
		if(china==null) {
			china=new China();
		}
		return china;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	

}
