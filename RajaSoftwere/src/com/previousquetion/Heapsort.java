package com.previousquetion;

public class Heapsort {
	 
	public void sort(int [] arr) {
		
		int length=arr.length;
		for(int i=length/2-1; i>=0; i--) {
			
			heaping(arr,length,i);
		}
		
		for(int i=length-1; i>=0; i--) {
			
			int temp=arr[i];
			arr[i]=arr[0];
			arr[0]=temp;
			
			heaping(arr,i,0);
		}
		
	}
	public void heaping(int [] arr,int length,int i) {
		
		int largest=length;
		int left=2*i+1;
		int right=2*i+1;
		
		if(left<length && arr[i]>arr[largest]) {
			largest=left;
		}
		if(right<length && arr[i]>arr[largest]) {
			largest=right;
		}
		if(largest!=i) {
			
			int temp=arr[i];
			arr[i]=arr[largest];
			arr[largest]=temp;
			
			heaping(arr,length,largest);
		}
	}
	
	public void printArray(int [] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]+" ");
		}
	}
	

	public static void main(String[] args) {
		
		int [] arr= {22,13,17,11,10,12};
		
		Heapsort hs=new Heapsort();
		hs.sort(arr);

	}

}
