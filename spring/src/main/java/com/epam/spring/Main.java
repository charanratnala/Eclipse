package com.epam.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.epam.spring"})
public class Main {

	
	
	
	
	
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
		
		CoffeeMachine mac=context.getBean(CoffeeMachine.class)	;	
		
		//mac.setTypes( context.getBean(Lotto.class));
		
		mac.setTypes(context.getBean(Lotto.class));
		//mac.getTypes(mac.setTypes(context.getBean(Lotto.class));
		
		
	}
}
