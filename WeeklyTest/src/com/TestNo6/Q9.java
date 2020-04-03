package com.TestNo6;
class Test
{
	String str="a";
	void a() throws Exception
	{
		try
		{
			str+="b";
			b();
		}
		catch(Exception e)
		{
			throw new Exception();
		}
		 finally { str+="e"; }
	}
	void b() throws Exception
	{
		try
		{
			str+="d";
			c();
		}
		catch(Exception e)
		{
		   	throw new Exception();
		}
	
	
	
		
		  finally { str+="e"; }
		 
		str+="f";
	}
	void c() throws Exception
	{
	
		throw new Exception();
	}
	
	void display()
	{
		System.out.println(str);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
} 

public class Q9 {

	public static void main(String[] args) {
		
		Test Obj=new Test();
		try
		{
		Obj.a();
		}
		catch(Exception e)
		{
			Obj.str+="c";
		}
		Obj.display();

	}

}
