package com.TechnicalInterviewQ;

import java.util.ArrayList;

public class FizzBuzz {
	
	public static ArrayList fizzBuzz(int nums)
	{
		ArrayList list=new ArrayList();
		for(int i=1; i<=nums; i++)
		{
			if((i%3==0)&&(i%5==0))
			{
				list.add("fizzBuzz");
			}
			else if(i%3==0)
			{
				list.add("fizz");
			}
			else if(i%5==0)
			{
				list.add("buzz");
			}
			else {
				list.add(i);
				
			}
			
		}
		
		return list;
	}

	public static void main(String[] args) {
		 
		
		System.out.println(fizzBuzz(15));

	}

}
