package com.naveen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class DataBaseService {
	
	@Autowired
	private Report report;
	
	@Bean
	void getDataFromDataBase() {
		report.getData();
	}
}
