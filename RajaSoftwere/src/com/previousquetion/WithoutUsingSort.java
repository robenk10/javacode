package com.previousquetion;

import java.util.*;

public class WithoutUsingSort {
	
	public static void sortWithoutUsingSorting(int [] array) {
		for(int i=0; i<array.length; i++) {
			array[i]=array[i]*array[i];
		}
		System.out.println(Arrays.toString(array));
	}

	public static void main(String[] args) {
		
		int arr[] = {-6,-3,-1,2,5,4,0};
	     sortWithoutUsingSorting(arr);
	}
}
