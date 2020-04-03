package com.previousquetion;

import java.util.Arrays;

public class StringToInteger {
	
	public static int integ(String s)	{
	     
		int sum=0;
		//char [] ch=s.toCharArray();
		/*
		for(char c:ch) {
			if(Character.isDigit(c)) {
				int n=((int)c-48);
				//int n=Character.getNumericValue(c);
				sum=(sum*10)+n;
			}
		}*/
		
		for(char c:s.toCharArray()) {
		     int n=(int)c -48;
		     sum=(sum*10)+n;
		     
		}
		System.out.println(sum);
		return Integer.parseInt(s);
	}

	public static void main(String[] args) {
		
		String s="123456079";
		
		int n=integ(s);
		System.out.println(n);
		//System.out.println((int)'0');
		int sum=0;
		int arr[] =new int[s.length()];
		int k=0;
		for(char c:s.toLowerCase().toCharArray()) {
			arr[k++]=((int)c-48);
			 
			 if(Character.isDigit(c)) {
				 int num=Character.getNumericValue(c);
				 sum=(sum*10)+num;
			 }
		}
		System.out.println(sum);
	
	}

}
