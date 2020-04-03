
package com.TrimLeadingANDTrailing;

public class TrailingSpaces {

	public static void main(String[] args) {
		
		
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
		   
		   System.out.println(st1.substring(0,i1+1));
		   
		}

	}


