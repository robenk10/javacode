package com.june2018;

public class Example4 {

	public static void main(String[] args) {
		
		String s="12:10:05";
		String s1[ ]=s.split(":");
		int sum=0;
		
		for(int i=0;i<s1.length;i++)
		{  
			
			int j=Integer.valueOf(s1[i]);
			if(i==0)
			{
		    sum=sum+(3600*j);
			}
			else if(i==1)
			{
				sum=sum+(j*60);
			}
			else
			{
				sum=sum+(j);
			}
	      
		}
		
		System.out.println(sum);
	}

}
