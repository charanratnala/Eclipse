package com.git.g;

import java.util.ArrayList;
import java.util.function.Predicate;

//import com.sun.tools.javac.util.List;

public class main {
	
	
	
	public static ArrayList<Factory> go(ArrayList<Factory> g,int s)
	
	{ArrayList<Factory> d= new ArrayList<Factory>();
	
		for(Factory h : g)
		{  
			
			System.out.println(h);
			
		}
		return d;
		
		
	}
	
	public static void main(String[] args) {
		

		
		
ArrayList<Factory> f= new ArrayList<Factory>();
	
		
		f.add(new Factory(50,4));
		f.add(new Factory(40,80));
	
		go(f, 40);
		
		
	

}
	

}
