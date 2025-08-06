package com.naveen;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("dc")
//@Primary
public class Debitcard implements Payment {
	
	public Debitcard() {
		System.out.println("Debit card object created");
	}
	
	@Override
	public void pay() {
		System.out.println("Payment done using debit card");

	}

}
