package com.naveen;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("cc")
@Primary
public class CreditCard implements Payment {

	public CreditCard() {
		// TODO Auto-generated constructor stub
		System.out.println("Credit card object created");
	}
	@Override
	public void pay() {
		System.out.println("Payment done using credit card");

	}

}
