package com.project;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestApp {
	public static void main(String[] args) {
		ApplicationContext sc=new AnnotationConfigApplicationContext(StudentConfig.class);
	}
}
