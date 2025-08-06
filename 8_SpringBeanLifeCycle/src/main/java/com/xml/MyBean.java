package com.xml;

public class MyBean {
	public void init() {
		System.out.println("My Bean Initialized");
	}
	
	public void doSomething() {
		System.out.println("My bean in use");
	}
	
	public void destroy() {
		System.out.println("Spring Bean destroyed");
	}
}
