package com.autowiring;

public class CreditCard implements Payment{
	public CreditCard() {
		System.out.println("Credit card object created");
	}

	@Override
	public void pay(int amt) {
		System.out.println("Bill of :"+amt+"paid through Credit card");
		
	}
}
