package com.FactorialOfRecursiveway;

public class FactorialOfRecursiveway {
	
	public int fact(int n)
	{
		if(n==1)
		{
			return 1;
		}
		else
		{
			return n*fact(n-1);
		}
		
	}

	public static void main(String[] args) {
		
		 FactorialOfRecursiveway f=new  FactorialOfRecursiveway();
		 
		 System.out.println(f.fact(5));

	}

}
