package com.naveen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Shopping {

	@Autowired
	//@Qualifier("dc")
	private Payment p;
	  
	
	public Shopping() {
	System.out.println("Shopping object created");
	}
//	@Autowired
//	Shopping( Payment p) {
//		this.p=p;
//	}


//	@Autowired
//	public void setP(Payment p) {
//		this.p = p;
//	}



	@Bean
	void doPayment() {
		if(p!=null) {
			p.pay();
		}else {
			System.out.println("No object is created for paymentd");
		}
	}
}
