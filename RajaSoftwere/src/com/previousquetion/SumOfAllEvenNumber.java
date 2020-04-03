package com.previousquetion;

public class SumOfAllEvenNumber {

	public static void main(String[] args) {
		
		int [] a= {1,2,1,2,3,4,5,7,8,6,12,5,7};
		
		int sum=0;
		for(int i=0; i<a.length; i++) {
			if(a[i]%2==0) {
				sum=sum+a[i];
			}
		}
		System.out.println(sum);

	}

}
