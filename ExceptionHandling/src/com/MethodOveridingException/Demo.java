package com.MethodOveridingException;

import java.io.IOException;

public class Demo {

	public static void main(String[] args) throws ArithmeticException, IOException {
		
		B b=new B();
		try
		{
		b.m();
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("heiillooelo");
		}
  
	}

}
