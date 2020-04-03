package com.CustomException;

public class Test {
	public void valid(int n) throws AgeValidator
	{
		if(n<18)
		{
			throw new AgeValidator("not Valid");
		}
		
	}

	public static void main(String[] args) {
		 
		Test t=new Test();
		try
		{
			t.valid(15);
		}
		catch(AgeValidator e)
		{
			System.out.println(e);
		}
		

	}

}
