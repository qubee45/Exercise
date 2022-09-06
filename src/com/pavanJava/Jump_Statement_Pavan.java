package com.pavanJava;

public class Jump_Statement_Pavan {

	public static void main(String[] args) {
		
		
		/*for (int i=1; i<=10;i++)
		{
			if (i==5)
				
			{
				break;					//Break out 	
				
			}
			System.out.println(i);
		}
	*/
		
		for (int i=1; i<=10;i++)
		{
			if (i==3 || i==5 || i==7)
				
			{
				continue;			//skip command			
				
			}
			System.out.println(i);
		}
	}

}
