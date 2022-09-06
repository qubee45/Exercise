package com.loops.java;

public class Constractor {

	String x;
	String y;
	
	public Constractor(String firstName, String lastName )
	{
		x=firstName;
		y= lastName;
	}
	
	public static void main(String[] args) {
		Constractor myobj=new Constractor("Mohammad", "Bhuiyan");
		System.out.println(myobj.x);
		System.out.println(myobj.y);
System.out.println(myobj.x + " " +myobj.y);
	}

}
