package com.AssignmentOfCW;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArrayDistance {
	
	/*public static Map<Character ,Integer>sort(String s) {
		
		HashMap<Character,Integer> map=new HashMap();
		
		
	}*/


	public static void main(String[] args) {
		
		String s="aaabbcca";
		
	   
		 for (int i = 0; i < s.length(); i++) { 
			  
	            // Counting occurrences of s[i] 
	            int count = 1; 
	            while (i + 1 < s.length() 
	                   && s.charAt(i) 
	                          == s.charAt(i + 1)) { 
	                i++; 
	                count++; 
	            } 
	            System.out.print(s.charAt(i) 
	                             + "" + count + " "); 
	        } 
	  
	        System.out.println(); 
	}
	  

}
