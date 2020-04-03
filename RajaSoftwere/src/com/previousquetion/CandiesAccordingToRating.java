package com.previousquetion;

import java.util.*;
import java.util.function.Consumer;

public class CandiesAccordingToRating {
	
	public static ArrayList<Integer> givingcandies(int [] arr) {
		List<Integer> list=new ArrayList();
        for(int i:arr) {
        	list.add(1);
        }
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i]<arr[i+1]) {
				int a=list.get(i)+list.get(i+1); 
				list.set(i+1, a);	
			}
		}
		for(int i=arr.length-2;i>=0;i--) {
			if(arr[i]>arr[i+1]) {
				int n=list.get(i)+list.get(i+1);
				list.set(i, n);	
			}
		}
		return (ArrayList<Integer>) list;
	}

	public static void main(String[] args) {
		
		int arr[] = {1,4,2,3,1};
		
		ArrayList<Integer> list=new ArrayList(givingcandies(arr));
		System.out.println(list);

	}

}
