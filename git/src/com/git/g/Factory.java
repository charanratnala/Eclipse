package com.git.g;

public class Factory 
{

private int s;
private int d;
public Factory(int s, int d) {
	super();
	this.s = s;
	this.d = d;
}
@Override
public String toString() {
	return "Factory [s=" + s + ", d=" + d + "]";
}
public int getS() {
	return s;
}
public void setS(int s) {
	this.s = s;
}
public int getD() {
	return d;
}
public void setD(int d) {
	this.d = d;
}
	
			
		
		
	
}
