package com.naveen.Beans;

public class PetrolEngine implements Engine {
	PetrolEngine(){
		System.out.println("Petrol engine object created");
	}
	@Override
	public void start() {
		System.out.println("Engine started with petrol");

	}

	@Override
	public void stop() {
		System.out.println("Petrol Engine stopped");

	}

}
