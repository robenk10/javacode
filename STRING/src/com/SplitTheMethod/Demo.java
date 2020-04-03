package com.SplitTheMethod;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
		
		String s="HELLO$WORLD";
		
		String s1[]	=s.split("\\$");

		
		for( String  x:s1)
		{
			System.out.println(x);
		}
		
		StringBuffer sb=new StringBuffer("Hello");
		
		sb.reverse();
		String s11=new String(sb);
		
		System.out.println(s11);
		
		String s2="help";
		String s3="help";
		System.out.println(s2==s3);
		
		
		StringBuffer sb1=new StringBuffer(s2);
        System.out.println(sb1);
        
        
       String sn= s2.replace('h'	,'g');
        System.out.println(sn);
		
		
		

	}

}
