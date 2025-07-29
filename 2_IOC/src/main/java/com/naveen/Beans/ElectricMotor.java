package com.naveen.Beans;

public class ElectricMotor implements Engine{
	public ElectricMotor() {
		// TODO Auto-generated constructor stub
		System.out.println("electric motor object created");
	}
	@Override
	public void start() {
		System.out.println("Electric motor started");
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Electric motor stopped");
		
	}

}
