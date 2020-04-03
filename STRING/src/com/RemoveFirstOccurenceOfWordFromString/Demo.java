package com.RemoveFirstOccurenceOfWordFromString;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
		
		/*
		 * String str = "java program java javav java";
		 * 
		 * String str2=str.substring(str.indexOf(" "));
		 * 
		 * System.out.println(str2);
		 */
		 
		

		String str = "java program java java java";  
		
		String str1="java";

		int n=str.indexOf("java");
		
		String [] s=str.split(" ");
		
		int c=0;
		for(int i=0;i<s.length;i++)
		{
			if(s[i].equalsIgnoreCase(str1))
			{
				c=s[i].length();
			}
		}
		
		
		String s3=str.substring(0, n)+str.substring(n+c);
		System.out.println(s3);
		
		
	}

}