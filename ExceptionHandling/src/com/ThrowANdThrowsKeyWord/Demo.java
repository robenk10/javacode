package com.ThrowANdThrowsKeyWord;

import java.io.IOException;

class A
{

	public void m() throws IOException
	{
		throw new ArithmeticException("Exception throw here"); 
	}

	public void n() throws IOException
	{   
		try
		{
			m();
		}
		catch(IOException e)
		{
			throw new IOException("Helllajei");
		}
	}

	public void p() throws IOException
	{ try {
		n();
	}
	catch(IOException e)
	{
		System.out.println("hhiiheihhiei");
	}
	}

}

public class Demo {

	public static void main(String[] args) throws IOException {

		A a=new A();
		try
		{
			a.p();
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}

	}

}
