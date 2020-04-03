package com.previousquetion;

import java.util.ArrayList;

public class AssertionQuetion {
	static int sum=0;
	public static int  add(int n,int m) {
		sum=n+m;
		return sum;
	}

	public static void main(String[] args) {
		
	 int number[] = {0,-2,-1,0,1,5};
	 int sum1=0;
	 for(int i=0; i<number.length-1; i++) {
		 if(number[i]-number[i+1]==1 || number[i]-number[i+1]==-1) {
			 int temp=add(number[i], number[i+1]);
			 sum1=sum1+temp;
		  } 
		 else {
			 sum=0;
		 }
	 }
	 
		
	}

}
