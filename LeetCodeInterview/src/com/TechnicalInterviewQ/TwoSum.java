package com.TechnicalInterviewQ;

public class TwoSum {

	public static void main(String[] args) {
		
		int target=9;
		int arr[] = {2,7,3,6};
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				
				int intarget=arr[i]+arr[j];
				if(intarget==target) {
					System.out.println(arr[i]+" "+arr[j]);
				}
			}
		} 
		

	}

}
