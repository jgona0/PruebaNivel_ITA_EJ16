package com.company;


public class Main {

	public static void main (String[] args) {
		
		PaymentsFactory factory = new PaymentsFactory();
		
		Payments p1 = factory.getPayment("EMPLOYEE");
		System.out.println("The bonus payment for an employee with a salary of 100€ is: " +p1.bonusPayment(100));
		
		Payments p2 = factory.getPayment("BOSS");
		System.out.println("The bonus payment for an employee with a salary of 100€ is: " +p2.bonusPayment(100));
		
	}
	
}