package com.marchQ14;

import java.util.HashSet;
import java.util.Scanner;

public class Student {
	
	 
	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
	        int t = s.nextInt();
	        String [] pair_left = new String[t];
	        String [] pair_right = new String[t];
	        
	        for (int i = 0; i < t; i++) {
	            pair_left[i] = s.next();
	            pair_right[i] = s.next();
	        }

	//Write your code here
	       HashSet<String> hashset = new HashSet<String>(t);
	       
	       for(int i = 0; i < t; i++)
	    {
	        hashset.add("(" + pair_left[i] + ", " + pair_right[i] + ")" );
	        System.out.println(hashset.size());        
	    }
	    
	    
	    for(String s3:hashset)
	    {
	    	System.out.println(s3);
	    }
	   }
	}


	


