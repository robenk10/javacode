package com.RemoveAllOccurences;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
		
		
		
	      String s1="PPPPaaabccdeeffppp";
		 
		  String s=s1.toLowerCase();
		  
	      System.out.println(s);
		   
		  char ch[]=s.toCharArray();
		  
		   
		   for(int i=0;i<ch.length;i++)
		   {
			    if(ch[i]=='p')
			    {
			    	ch[i]=' ';
			    	
			    	
			    }
		   }
		   
		 
		   
		   String str=new String(ch);  
		  // System.out.println(str);
		   int i=0;
		   for(;i<str.length();)
		   {
			   if(str.charAt(i)==' ')
			   {
				   i++;
			   }
			   else 
			   {
				   break;
			   }
		   }
		   
		   System.out.println(str.substring(i));
		  
	}

}
