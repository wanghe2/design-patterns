package com.wang.dymatics;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
/**
 * 动态代理类 ，借助Proxy.newProxyInstance（） ,和InvocationHandler
 * 
 * （这个代理类不是单独为那个类而创建的，只有是有接口有实现类，都可以调用该代理类）
 * @author wanghe
 *
 */
@SuppressWarnings("rawtypes")
public class PersonProxy implements InvocationHandler{
	
	private Class targetClass;
	private Object targetObj;
	
	/**
	 * 
	 * @param targetclass 这里的class其实是接口
	 * @param targetObj  这里的obj，是接口具体实现类的实例对象
	 */
	public PersonProxy(Class targetclass,Object targetObj) {
		this.targetClass=targetclass;
		this.targetObj=targetObj;
	}

	public Object getProxy() {
		return Proxy.newProxyInstance(getClass().getClassLoader(), new Class[] { targetClass }, this);
	}

	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.err.println("******动态代理类的开场白：实现类准备执行********");
		method.invoke(targetObj, args);
		System.err.println("******动态代理类结束语：实现类执行结束 ********");
		return null;
	}	
}
