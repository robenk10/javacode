package com.previousquetion;

public class CountNote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int arr[]= {2000,1000,500,200,100,50,20,10,5,2,1};
		
		int target=5511;
		for(int i=0; i<arr.length; i++) {
			if(target/arr[i]!=0) {
				System.out.println(arr[i]+" :: "+target/arr[i]);
			}
			target=target%arr[i];
		}
	}

}
