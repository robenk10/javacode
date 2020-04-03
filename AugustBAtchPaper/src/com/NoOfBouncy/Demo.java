package com.NoOfBouncy;

public class Demo {

	public static void main(String[] args) {
		
		int []	arr= {1,2,2,3,5,5,6};
		
		boolean flag=false;
		//boolean flag1=true;
		for(int i=0; i<arr.length-1; i++) {
			 flag=false;
			for(int j=i+1; j<arr.length; j++) {
				
				if(arr[i]>=arr[j]) {
					 flag=true;
				}
			}
		}
		
		
		if(flag=true) {
			System.out.println("increasing Number");
		}
	}

}
