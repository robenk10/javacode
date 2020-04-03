package com.TechnicalInterviewQ;

public class PaintingHouse {

	public static void main(String[] args) {
		
		int [][] arr= {{65,23,1},{1,16,5},{2,3,9}};
		
		for(int i=1; i<arr.length; i++) {
			arr[i][0] =arr[i][0]+Math.min(arr[i-1][1], arr[i-1][2]);
			arr[i][1]=arr[i][1]+Math.min(arr[i-1][0], arr[i-1][2]);
			arr[i][2]=arr[i][2]+Math.min(arr[i-1][0], arr[i-1][1]);
		}
       
		System.out.println(Math.min(Math.min(arr[arr.length-1][0],arr[arr.length-1][1]),arr[arr.length-1][2]));
	}
   
}
