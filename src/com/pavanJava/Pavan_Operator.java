package com.pavanJava;

public class Pavan_Operator {

	public static void main(String[] args) {
		
		/*  Arithmetic operators + - * % /
		 * relational operator (comparison operator) == < > <= => !=
		 * Logical operator && || !
		 * incremental operator ++ --
		 * Assignment operator = 
		 */
		
		int a=10;
		int b=20;
		
		//Arithmetic operators + - * % /
		
		System.out.println(a+b);
		System.out.println(b-a);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		//relational operator (comparison operator) == < > <= => !=
		
		System.out.println(a==b);
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		System.out.println(a!=b);
		
		//Logical operator && || !
		
		boolean x = true;
		boolean y = false;
		
		System.out.println(x && y);
		System.out.println(x || y);
		System.out.println(!x);
		System.out.println(!y);
		
		// incremental operator ++ --
		
		a=10;
		a++;					// a= a+1
		System.out.println(a);
		
		b=20;					// b= b-1
		b--;
		System.out.println(b);
		
		
		
	}
}
