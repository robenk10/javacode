package com.previousquetion;

public class PairOfNumber {

	public static void main(String[] args) {
		
		int sum=7;
		int [] arr= {3,4,5,2,3,6,1,2};
		int isSum=0;
		for(int i=0; i<arr.length; i++) {
			isSum=0;
			for(int j=i+1; j<arr.length; j++) {
			     
				isSum=isSum+arr[i]+arr[j];
			      
			      if(sum==isSum) {
			    	  System.out.println(arr[i]+" " +arr[j]);
			    	  isSum=0;
			      }
				
			}
		}

	}

}
