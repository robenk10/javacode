package com.previousquetion;

public class SpiralMatrix {

	public static void main(String[] args) {
		
		int index=0;
		
		int left=0;
		int top=0;
		int right=5-1;
		int bottom=5-1;
		
		int arr[][] =new int[4][4];
		
		while(true) {
			
			if(left>right) {
				break;
			}
			for(int i=left;i<right; i++) {
				arr[top][i]=index++;
			}
			top++;
			if(top>bottom) {
				break;
			}
			for(int j=top; j<bottom; j++) {
				arr[j][right-1]=index++;
			}
			right--;
			
			if(right<left) {
				break;
			}
			for(int j=right-1; j>=left; j--) {
				arr[bottom-1][j]=index++;
			}
			bottom--;
			if(bottom<top) {
				break;
			}
			for(int i=bottom-1; i>=top; i--) {
				arr[i][left]=index++;
			}
			left++;
		}
		
		for(int i=0; i<arr.length; i++	) {
			for(int j=0; j<arr.length; j++) {
				System.out.print("  "+arr[i][j]+"  ");
			}
			System.out.println();
		}  
		

	}

}
