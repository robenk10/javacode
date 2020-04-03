package com.FibbonacciSeriesRecursion;

public class FibbonacciSeriesRecursion {
	
public 	static int a=0;
public	static int b=1;
public 	static int c=0;

public static int fibbo(int count )
{   
	if(count==0)
	{
		return 0;
	}
	else
	{
		c=a+b;
		a=b;
		b=c;
		System.out.print(c+" ");
		
		return fibbo(count-1);
	}
	
}
	public static void main(String[] args) {
		
		int count=15;
       System.out.print(a+" "+b+" ");
       
       fibbo(count-2);
	}

}
