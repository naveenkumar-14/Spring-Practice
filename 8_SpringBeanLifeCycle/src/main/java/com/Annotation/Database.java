package com.Annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class Database {
	@PostConstruct
	public void connection() {
		System.out.println("Connection established");
	}
	
	public void getData() {
		System.out.println("Data fetched");
	}
	
	@PreDestroy
	public void disconnect() {
		System.out.println("Disconnection successful");
	}
}
