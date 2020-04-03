package com.previousquetion;

public class NthPrimeNumber {

	public static void main(String[] args) {

	  	int n=5;
		int count=0;
		int num=1;
		int i;
		while(count<n){
			num=num+1;
			for(i=2; i<=num; i++) {
				if(num%i==0) {
					break;
				}
			}
			if(i==num) {
				count++;
			}
		}
		System.out.println(num);
		


	}

}
