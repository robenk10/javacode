package com.CHeckedExceptionPropagation;


import java.io.IOException;

public class Demo {
	
	public void m() throws IOException
	{
		throw new IOException("IOException Happen Here");
	}
	public void n() throws IOException
	{
		m();
	}
	
	public void p() throws IOException
	{
		try 
		{
			n();
		}
		catch(IOException e)
		{
			System.out.println(e);
			throw new IOException("Try Another Exception");
		}
		
	}

	public static void main(String[] args) throws IOException ,Exception{
	
		Demo d=new Demo();
		try
		{
		d.p();
		}
		catch(IOException e)
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
