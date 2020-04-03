package com.previousquetion;

import java.util.Scanner;

public class HexaDecimalToBinary {
	
	public static void hexatoDec(String s) {
	 /* String s1="";
		String sum="";
		for(int i=0; i<s.length(); i++) {
			
			if(Character.isDigit(s.charAt(i))) {
				s1=s1+s.charAt(i);
			}
			else if(s.charAt(i)=='A'||s.charAt(i)=='B'||s.charAt(i)=='C'||s.charAt(i)=='D'||s.charAt(i)=='E'||s.charAt(i)=='F'){
			    int n=(int)s.charAt(i);
				//s1=s1+s.charAt((int)i-55);	
			    s1=s1+(n-55);
			}
		}
			/*(
			while(n>0) {
				int d=n%2;
				sum=sum+d;
				n=n/2;
			}*/
		
		int n=Integer.parseInt(s ,16);
		System.out.println(n);
       
		String b=Integer.toString(n, 2);
        System.out.println(b);
       
        
        String str=Integer.toHexString(n);
        System.out.println(str);
	}

	public static void main(String[] args) {
	  
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter hexadecimal");
		String n=sc.next();
		hexatoDec(n);
	}

}
