package com.TrimLeadingANDTrailing;

public class LeadingSpace {
	
	public static void main(String[] args) {
		
	   String str="----java----";
	   
	   String str1=" ";
	   int i=0;
	   
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
	   
	   System.out.println(str.substring(i));
	   
	
	
	
	
	 String st1="----java----";
	   
	  
	   int i1=st1.length()-1;
	  
	  while(i1>=0)
	   {
		   if(st1.charAt(i1)=='-')
		   {
			   i1--;
		   }
		   else
		   {
			   break;
		   }
	   }
	   
	   System.out.println(str.substring(0,i1+1));
	   
	   
	   
	}
	   
}
