package collection;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;



@Configuration
@ComponentScan()
public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext();
		
		Scanner scan= new Scanner(System.in);
		
		while(true)
		{
			System.out.println("welcome to family app!!!!!");
			
			
			System.out.println(" press 1 for entering data");
			System.out.println(" press 2 for retrieving  data");
			System.out.println(" press 3 for back ");
			
			int choice = scan.nextInt();
			switch(choice)
			{
			case 1: System.out.println("enter father name");
			        String father= scan.next();
			    //Entity ent=    context.getBean(Entity.class);
			           System.out.println("enter mother name");
			String mother = scan.next();
			System.out.println(" enter child 1");
			String child = scan.next();
			System.err.println("child 2");
			String child2= scan.next();
			     Entity t= new Entity(father,mother,child,child2);
			     DB d= new DB();
			     d.set(t);
			     
			
			}
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
	}
	
	
	
}
