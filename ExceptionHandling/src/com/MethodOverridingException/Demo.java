package com.MethodOverridingException;

class A
{
	public void get(int n) {  
		if(n<18)
		{
		System.out.println("hi");
		
		throw new  ArithmeticException("HiIIII");
		}
	}
}

  
