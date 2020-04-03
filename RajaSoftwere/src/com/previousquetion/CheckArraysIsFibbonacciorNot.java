package com.previousquetion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class CheckArraysIsFibbonacciorNot {

	public static void main(String[] args) {
		
		
		HashMap<String ,Integer> map=new HashMap();
	    
		
		
		
		
		
		
		
		
		
		
		
		
		int arr[] = {1,0,1,2,5,3,7,12};
		Arrays.sort(arr);
		boolean flag=false;
		for(int i=2; i<arr.length; i++) {
			flag=false;
			if(arr[i-2]+arr[i-1]==arr[i]) {
				flag=true;
			}
		}
		if(flag==true) {
			System.out.println("yes Its is fibbonacci");
		}
		else {
			System.out.println("it is not");
		}

	}

}
