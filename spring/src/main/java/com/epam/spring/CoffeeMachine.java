package com.epam.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CoffeeMachine {
   
	
	
	 @Qualifier("lotto")
	CoffeeTypes types ;
		
	 @Autowired 
	CoffeeMachine(CoffeeTypes type)
	{
		System.out.println(" hii");
		this.types=type;
		
	}
	
	public CoffeeTypes getTypes() {
		return types;
	}

	public void setTypes(CoffeeTypes types) {
		this.types = types;
	}
	
	
	
	
}
