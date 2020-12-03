package com.company;

public class Boss implements Payments{


	@Override
	public double bonusPayment(double salary) {
		
		return salary * 0.25;
	}

}
