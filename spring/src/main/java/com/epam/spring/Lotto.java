package com.epam.spring;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Lotto implements CoffeeTypes {

	
	public void coffee()
	{
		System.out.println("here the lotto");
		return;
	}
	
	
	
	
}
