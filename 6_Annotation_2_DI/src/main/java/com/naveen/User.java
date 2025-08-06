package com.naveen;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class User {
	public static void main(String[] args) {
		ApplicationContext ac=new AnnotationConfigApplicationContext(Shopping.class);
	}
}
