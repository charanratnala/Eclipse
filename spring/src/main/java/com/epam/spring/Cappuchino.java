package com.epam.spring;

import org.springframework.stereotype.Component;

@Component
public class Cappuchino implements CoffeeTypes {
	
	public void coffee()
	{
		
			System.out.println("here is the cappuchino take it");
			return;
	}

	
	
	public static void main(String[] args) {
		
//		Cappuchino cap= new Cappuchino();
//		
//		cap.cappu();
		
	}




	
}
