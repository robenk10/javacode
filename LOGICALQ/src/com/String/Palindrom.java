package com.String; 

public class Palindrom {

	public static void main(String[] args) {
		
		String s="nitin";
		
	/*	
		
		char ch[] =s.toCharArray();
		String s1="";
		for(int i=ch.length-1;i>=0;i--)
		{
			char c=ch[i];
		s1=s1+c;
		}
          
		System.out.println(s1);
		
		if(s1.equals(s))
		{
			System.out.println("String is Palindrome");
	}
		
		else
		{
			System.out.println("String is not palindrome");
	}*/
		
		
		
		StringBuffer sb=new StringBuffer(s);
		
		sb.reverse();
		
		System.out.println(sb);
		
		
		String s2=sb.toString();
		
		if(s.equals(s2))
		{
			System.out.println("String is palindrome");
		}
	}

}
