package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class PaymentsFactory {

	final static Map<String, Supplier<Payments>> map = new HashMap<>();
	 
	 static {
	  map.put("EMPLOYEE", Employee::new);
	  map.put("BOSS", Boss::new);
	 }
	
		
	public Payments getPayment(String workerType) {
		
		Supplier <Payments> object = map.get(workerType);	

		return object.get();
	}
	
}
