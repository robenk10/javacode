package com.UncheckedExceptionPropagation;

import java.io.IOException;

public class Demo {
	
	public void m() 
	{
		throw new ArithmeticException("IOException Happen Here");
	}
	public void n() 
	{
		m();
	}
	
	public void p()
	{
		try 
		{
			n();
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
			throw new ArithmeticException("Try Another Exception");
		}
		
	}

	public static void main(String[] args){
	
		Demo d=new Demo();
		try
		{
		d.p();
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
			try
			{
			
			throw new Exception("hhiihiehh");
			}
			catch(Exception e1)
			{
				System.out.println(e1.getMessage());
			}
		}
		
		
		System.out.println("Normal FLow");
		

	}

}
