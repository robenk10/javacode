package com.TrownExceptionInMainMethod;

public class Demo {
	
	
	

	public static void main(String[] args) {
		
		Demo d=new Demo();
		int a;
		
		try
		{   
			//a=20/0;
			throw new ArithmeticException();
		}
		
		
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		

	}

}
