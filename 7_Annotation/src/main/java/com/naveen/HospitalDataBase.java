package com.naveen;

import org.springframework.stereotype.Repository;

@Repository
public class HospitalDataBase implements Report {

	@Override
	public void getData() {
		System.out.println("Getting report from Hospital DB");

	}

}
