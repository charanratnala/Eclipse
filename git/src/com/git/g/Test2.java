package com.git.g;



//import com.sun.tools.javac.util.List;

public class Test2{

		
	
	double sal;
	private int phno;
	private String name;
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public int getPhno() {
		return phno;
	}
	public void setPhno(int phno) {
		this.phno = phno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Test2(double sal, int phno, String name) {
		super();
		this.sal = sal;
		this.phno = phno;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Test2 [sal=" + sal + ", phno=" + phno + ", name=" + name + "]";
	}
	
	
	
		
		

}