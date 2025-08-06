package com.Annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestDataBase {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext acac=new AnnotationConfigApplicationContext(Database.class);
		Database db=acac.getBean(Database.class);
		db.getData();
		acac.close();
	}
}
