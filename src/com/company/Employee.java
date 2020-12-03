package com.company;

public class Employee implements Payments{

	@Override
	public double bonusPayment(double salary) {

		return salary * 0.1;
	}
}
