package com.naveen.Beans;

public class DebitCard implements Payment{
	public DebitCard() {
		System.out.println("Debit card object created");
	}

	@Override
	public void pay(int amt) {
		System.out.println("Bill of :"+amt+"paid through Debit card");
		
	}
}
