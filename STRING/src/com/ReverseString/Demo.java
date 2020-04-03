package com.ReverseString;

public class Demo {

	public static void main(String[] args) {
		
		String s="Hello java";
		
		String s1[] =s.split(" ");
        
		for(int i=0;i<s1.length;i++)
		{    
			String s3="";
			for(int j=0;j<s1[i].length();j++)
			{
				char c=s1[i].charAt(j);
				s3=c+s3;
			}
			
			System.out.print(s3+" ");
		}
	}

}
