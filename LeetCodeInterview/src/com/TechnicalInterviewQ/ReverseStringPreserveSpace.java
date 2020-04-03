package com.TechnicalInterviewQ;

import java.util.*;

public class ReverseStringPreserveSpace {
   public static String reversePreserveSpace(String str) {
	   
	   Set<Character> space=new HashSet<>();
	   space.add(' ');
	   int i=0;
	   int j=str.length()-1;
	   char [] character=str.toCharArray();
	   while(i<j) {
		   if(i<j && space.contains(character[i])) {
			   i++;
		   }
		   if(i<j && space.contains(character[j])) {
			   j--;
		   }
		   
		   char temp=character[i];
		   character[i++]=character[j];
		   character[j--]=temp;
	   }
	   
	   return new String(character);
	   
   }
	public static void main(String[] args) {
		
		String str="Robin k";
		
		System.out.println(reversePreserveSpace(str));

	}

}
