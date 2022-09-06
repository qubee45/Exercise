package com.BasicJava.exercise;

public class ReturnMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = userFirstName();
		 String name1 = userLastName();
		System.out.println(name + name1 );

	}
	public static String userFirstName()
	{
		return "Mohammad";
	}
public static String userLastName()
{
	return "Bhuiyan";
	}
}
