package com.Programmatic_Interface;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringBean {
	public static void main(String[] args) {
		ApplicationContext cp = new ClassPathXmlApplicationContext("SpringDean.xml");
		SpringBean sb=cp.getBean(SpringBean.class);
		sb.doSomething();
		((ClassPathXmlApplicationContext)cp).close();
	}
}
