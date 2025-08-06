package com.annotations;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.annotations","in.naveen"})
public class Config {
	public Config() {
		// TODO Auto-generated constructor stub
		System.out.println("Config object");
	}
}
