package com.autowiring;

public class Shopping {
	private Payment p;
	
	public Shopping(Payment p) {
		System.out.println("constructor injection");
		this.p = p;
	}



	public Shopping() {
	System.out.println("Shopping object created");
	}
	
	

	public void setP(Payment p) {
		System.out.println("Setter injection");
		this.p = p;
	}

	void doPayment(int amt) {
		if(p!=null) {
			p.pay(amt);
		}else {
			System.out.println("No Payment mode selected");
		}
	}
}
