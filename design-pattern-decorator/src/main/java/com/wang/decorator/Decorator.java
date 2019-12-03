package com.wang.decorator;
/**
 * 装饰品的公共接口 (如果没有具体的装饰者，这其实就像代理模式一样)
 * @author wanghe
 *
 */
public class Decorator implements IPerson{

	private IPerson person;
	
	public  Decorator(IPerson person) {
		this.person=person;
	}
	
	@Override
	public void introduce() {
		person.introduce();
	}

}
