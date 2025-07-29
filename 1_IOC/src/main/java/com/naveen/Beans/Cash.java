package com.naveen.Beans;

public class Cash implements Payment{
	public Cash(){
		System.out.println("Cash object created");
	}

	@Override
	public void pay(int amt) {
		System.out.println("Bill of :"+amt+"paid through cash");
		
	}
}
