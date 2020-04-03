package com.wishtree;

public class OcurrenceOfNumber {

	public static void main(String[] args) {
		
		int []arr= {1,1,2,3,1,2,4,0};
		
		int count=1;
		boolean flag=true;
		int previous=0;
		int next=0;
		int min=Integer.MAX_VALUE;
		
		for(int start=0; start<arr.length; start++) {
			count=1;
				next=start+1;
				while(next<arr.length) {
	2				if(arr[start]==arr[next]) {
						count++;
					}	
					next++;
				}
                 if(count==1 && min>arr[start]) 
					 min=arr[start];
		}
	    System.out.println(min);
	}

}
