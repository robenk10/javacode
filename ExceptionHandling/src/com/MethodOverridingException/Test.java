package com.MethodOverridingException;

import java.io.IOException;

class B extends A  
{
public void get(int n)  throws ArithmeticException
{   
	System.out.println("hello");
	
	if(n<18)
	{    
		super.get(15);
		throw new ArithmeticException ("Not valid Age");
	}
   
}
}
public class Test {

	public static void main(String[] args) {
         
		B b=new B();
		try
		{
		b.get(17);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
       System.out.println("hi");
	}

}
