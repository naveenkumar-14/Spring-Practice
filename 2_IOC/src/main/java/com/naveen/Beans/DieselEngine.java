package com.naveen.Beans;

public class DieselEngine implements Engine{
	public DieselEngine() {
		// TODO Auto-generated constructor stub
		System.out.println("Diesel engine object created");
	}
	@Override
	public void start() {
		System.out.println("Engine started with diesel");
		
	}

	@Override
	public void stop() {
		System.out.println("Diesel Engine stopped");
		
	}

}
