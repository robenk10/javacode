package com.TrimLeadingANDTrailing;

public class LeadingAndTrailing {

	public static void main(String[] args) {


		String str="----java----";

		int i=0;
		
		System.out.println(str);

		for(;i<str.length();)
		{
			if(str.charAt(i)=='-')
			{
				i++;
			}
			else
			{
				break;
			}
		}

		String str1=str.substring(i); 
		System.out.println(str1);
         
		int n=str1.indexOf('j');
		

		int i1=str1.length()-1;

		while(i1>=0) 
		{ 
			if(str1.charAt(i1)=='-') 
			{ i1--; 
			      } 
		else 
		   {
			break; 
			} 
		}

		System.out.println(str1.substring(0,i1+1));



	}

}
