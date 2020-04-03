package com.ClassProgram;
class Test
{
  public static	void show()
	{
		System.out.println("hi");
		try
		{
			System.out.println(10/12);
			System.out.println("hhlel");
												
		}
		
		catch(NullPointerException e)	
		{
			System.out.println(e.getMessage());
		}
		
		catch(ArithmeticException e)	
		{
			System.out.println(e.getMessage());
			
			System.out.println("heloo");
		}
		
		catch(ArrayIndexOutOfBoundsException e)	
		{
			System.out.println(e.getMessage());
		}
		
		finally
		{
			System.out.println("hava a Good day");
		}
	}
}
public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		 Test.show();
	}

}
