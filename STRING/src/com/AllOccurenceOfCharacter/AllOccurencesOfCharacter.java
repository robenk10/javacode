package com.AllOccurenceOfCharacter;

public class AllOccurencesOfCharacter {

	public static void main(String[] args) {
		
		
		  String s1="Thinkquotient is the best company to work for ";
		  
		  String s=s1.toLowerCase();
		   int size=256;
		   
		   int [] count=new int[size];
		   
		   for(int i=0;i<s.length();i++)
           
		   {
			   count[s.charAt(i)]++;
		   }
		    
		 
		   
		   for(int i=0;i<size;i++)
		   {
			 if(count[i]>=1)
			 { 
				
				   System.out.println((char)i+"::"+count[i]);
				 
			 }
			     
		   }
		   

	}

}
