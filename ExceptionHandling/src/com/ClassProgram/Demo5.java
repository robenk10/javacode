package com.ClassProgram;
 class Demo
 {
	 public void valid(int n)
		{  try
		{ 
			if(n<18)
			{
				//throw new ArithmeticException ("Not valid Age");
			}
			else
			{   
				
				System.out.println("valid");
			}
		}
		
		catch(ArithmeticException e)
		{    
			
			System.out.println(e.getMessage());
		}
		/*
		 * finally { 
		 * System.out.println("program shut down "); 
		 * }
		 */
		
		}
	
	 
 }
public class Demo5 {

	public static void main(String[] args) {
		
		Demo d=new Demo();
		try
		{
			d.valid(15);
		}
	  finally {
		System.out.println("heloo");
	  }
		
		
	}

}
