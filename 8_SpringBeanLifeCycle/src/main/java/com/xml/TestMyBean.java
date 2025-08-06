package com.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMyBean {
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("Bean.xml");
		MyBean mb=ac.getBean(MyBean.class);
		mb.doSomething();
		((ClassPathXmlApplicationContext)ac).close();
		
	}
}
