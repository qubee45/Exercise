
  package com.BasicJava.exercise;

public class staticMethod {
	
	public static	int Salary = 65;

	public static void main(String[] args) {
	
		monthlySalaryStatic();
		
		
	}

	private static void monthlySalaryStatic() 
	
	{
		
		int monthlySalary = Salary * 200;
		System.out.println("Monthly Income  "+ monthlySalary);
	}
	
	}

	

