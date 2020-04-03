
package com.MethodOveridingException;

import java.io.IOException;

public class B extends A{

	public void m() throws IOException ,ArithmeticException
	{   try
	{ 
		super.m();
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
	throw new IOException("hello");
	
	
	}
}
