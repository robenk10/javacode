package com.RemoveLastOccurenceOfWordFromString;

public class Demo {

	public static void main(String[] args) {
		
        String str = "java program java java java";  
		
		String str1="java";

		int n=str.lastIndexOf("java");
		
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
