package com.naveen;

import org.springframework.stereotype.Repository;

@Repository("report")
public class SchoolDataBase implements Report{

	@Override
	public void getData() {
		System.out.println("Getting report from School DB");
		
	}

}
