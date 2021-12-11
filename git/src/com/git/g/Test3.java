package com.git.g;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Test3 
{

			
		
	
	public static void main(String[] args) {
		
	
		
		ArrayList<Test2> k = new ArrayList<Test2>();
	  Test2 h=new Test2(10.3,5,"sai");
		Test2 j=(new Test2(11.5,8,"charan"));
		k.add(h);
		k.add(j);
		   
	double summ=k.stream().collect(Collectors.summingDouble(s ->s.sal));
		
		System.out.println(summ);
		
}
}

