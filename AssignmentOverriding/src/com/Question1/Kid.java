package com.Question1;

public class Kid {
	
	public void readBook()
	{
		System.out.println("ReadMethod without parameterised");
	}
	
	public void readBook(int a,String s)
	{
	   System.out.println(a+" "+s);
	   System.out.println("ReadMethod with parameter");
	}

}

class BigKid extends Kid
{
	public void readBook()
	{
		System.out.println("In BigKid class overridden readbook method");
	}
	
	public void readBook(int a,String s)
	{
	   System.out.println(a+" "+s);
	   System.out.println("ReadMethod with parameter in BigKid Class");
	}
}
