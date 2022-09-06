package com.BasicJava.exercise;

public class ReturnMethod_1 {
	
public static void main(String[] args) {
	int x = multiFunctionA();
	int y = multiFunctionB();
	String z = numericValue();
	System.out.println(x*y);
	System.out.println(z);
}
public static int multiFunctionA()
{
	return 10;
	}
public static int multiFunctionB()
{
	return 30;
	}
public static String numericValue() {
	return "Total";
}
}
