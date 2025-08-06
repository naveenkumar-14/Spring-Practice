package com.Programmatic_Interface;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class SpringBean implements InitializingBean,DisposableBean{

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Spring bean Object Initialized");
	}

	public void doSomething() {
		System.out.println("Spring bean in use");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Spring Bean destroyed");
		
	}
}
