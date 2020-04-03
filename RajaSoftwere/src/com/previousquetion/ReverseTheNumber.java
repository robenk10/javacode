package com.previousquetion;

public class ReverseTheNumber {

	public static void main(String[] args) {
		
		int n=121;
		StringBuilder sb=new StringBuilder(Integer.toString(n));
		System.out.println(sb.reverse());
		
	   /*	int sum=0;
		int d;
		while(n>0) {
			
			d=n%10;
			sum=(sum*10)+d;
			n=n/10;
		}
		System.out.println(sum);*/
		//int n1=Integer.parseInt(Integer.toString(n));
		int n1=Integer.parseInt(sb.toString());
		System.out.println(n1);
		System.out.println(n);

	}

}
