package com.TechnicalInterviewQ;

public class PeakElement {

	public static void main(String[] args) {
		
		int[] arr= {1,2,1,3,2};
        for(int i=1; i<arr.length-1; i++) {
        	
        	if(arr[i]> arr[i+1] && arr[i]> arr[i-1]	) {
        		System.out.println(arr[i]);
        	}
        }
        ///System.out.println(left);
        
	}

}
